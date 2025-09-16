/* *
 * 操作类：MovieInfoOperator
 */

package tools.movie.info;

public class MovieInfoOp {
    private MovieInfo[] movieInfoList;

    //构造器
    public MovieInfoOp() {
        movieInfoList = new MovieInfo[MovieInfo.MAX_CNT];
    }
    
    public MovieInfoOp(MovieInfo[] movieInfoList) {
        this.movieInfoList = movieInfoList;
    }

    public MovieInfo[] getMovieInfoList() {
        return movieInfoList;
    }

    public void setMovieInfoList(MovieInfo[] movieInfoList) {
        this.movieInfoList = movieInfoList;
    }

    //查询，独一无二的标识符，id和name
    private MovieInfo findById(int id) {
        for (int i = 0; i < MovieInfo.getCnt(); i++) {
            if (movieInfoList[i].getId() == id) {
                return movieInfoList[i];
            }
        }
        return null;
    }

    private MovieInfo findByName(String name) {
        for (int i = 0; i < MovieInfo.getCnt(); i++) {
            if (movieInfoList[i].getName().equals(name)) {
                return movieInfoList[i];
            }
        }
        return null;
    }

    //增加，增加完整的电影信息
    public void addMovieInfo(MovieInfo movieInfo) {
        if(MovieInfo.getCnt() <= MovieInfo.MAX_CNT){
            movieInfoList[MovieInfo.getCnt()] = movieInfo;
            MovieInfo.setCnt(MovieInfo.getCnt() + 1);
        }else{
            System.out.println("电影信息已满!!!");
        }
    }

    //显示，独一无二的标识符，id和name
    private void showMovieInfo(MovieInfo movieInfo) {
        System.out.println("--------------------------------");
        if(movieInfo != null){
            System.out.println("编号\t\t名称\t\t价格\t\t主演\t\t评分");
            System.out.println(movieInfo.getId() + "\t\t" + movieInfo.getName() + "\t\t" + movieInfo.getPrice() + "\t\t" + movieInfo.getActor() + "\t\t" + movieInfo.getScore());
        }else{
            System.out.println("没有找到该电影");
        }
        System.out.println("--------------------------------");
    }

    public void showMovieInfo(int id) {
        showMovieInfo(findById(id));
    }

    public void showMovieInfo(String name) {
        showMovieInfo(findByName(name));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (MovieInfo movieInfo : movieInfoList) {
            if (movieInfo == null) {
                break;
            }
            sb.append(movieInfo.toString());
        }

        return "MovieInfoOp{" +
                "movieInfoList=" + sb.toString() +
                '}';
    }
}

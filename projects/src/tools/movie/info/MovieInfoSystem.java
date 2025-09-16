/* *
 * 简易版电影信息管理系统
 * @author sinwind
 * @version 0.1
 * @date 2025-09-13
 * @description
 * 需求：
 *  展示系统中的全部电影信息（每部电影展示名称价格）
 * 允许用户根据电影编号（id）查询电影详细信息
 */

package tools.movie.info;

public class MovieInfoSystem {
    public static void main(String[] args) {
        MovieInfoOp movieInfoOp = new MovieInfoOp();

        movieInfoOp.addMovieInfo(new MovieInfo(1, "唐顿庄园", 9.9, 9.5, "张艺谋"));
        movieInfoOp.addMovieInfo(new MovieInfo(2, "星际穿越", 9.4, 8.6, "克里斯托弗·诺兰"));
        movieInfoOp.addMovieInfo(new MovieInfo(3, "千与千寻", 9.4, 8.6, "宫崎骏"));
        movieInfoOp.addMovieInfo(new MovieInfo(4, "肖申克的救赎", 9.7, 9.3, "弗兰克·德拉邦特"));
        movieInfoOp.addMovieInfo(new MovieInfo(5, "流浪地球2", 8.3, 7.8, "郭帆"));
        movieInfoOp.addMovieInfo(new MovieInfo(6, "蜘蛛侠：平行宇宙", 8.7, 8.4, "鲍勃·佩尔西凯蒂"));
        movieInfoOp.addMovieInfo(new MovieInfo(7, "控方证人", 9.6, 8.6, "比利·怀尔德"));
        movieInfoOp.addMovieInfo(new MovieInfo(8, "哈尔的移动城堡", 9.1, 8.2, "宫崎骏"));
        movieInfoOp.addMovieInfo(new MovieInfo(9, "盗梦空间", 9.4, 8.8, "克里斯托弗·诺兰"));
        movieInfoOp.addMovieInfo(new MovieInfo(10, "霸王别姬", 9.6, 8.1, "陈凯歌"));
        movieInfoOp.addMovieInfo(new MovieInfo(11, "疯狂动物城", 9.2, 8.0, "拜伦·霍华德"));
        movieInfoOp.addMovieInfo(new MovieInfo(12, "看不见的客人", 8.8, 8.1, "奥里奥尔·保罗"));
        movieInfoOp.addMovieInfo(new MovieInfo(13, "长津湖", 7.4, 7.1, "陈凯歌/徐克"));
        movieInfoOp.addMovieInfo(new MovieInfo(14, "寻梦环游记", 9.1, 8.4, "李·昂克里奇"));
        movieInfoOp.addMovieInfo(new MovieInfo(15, "教父", 9.3, 9.2, "弗朗西斯·科波拉"));

        movieInfoOp.showMovieInfo(15);
        movieInfoOp.showMovieInfo("霸王别姬");
        System.out.println(movieInfoOp.toString());
    }


}

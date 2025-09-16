/* *
 * 实体类：MovieInfo
 *
 * TODO:
 *  加入效验方法
 *  加入更多信息
 */

package tools.movie.info;

public class MovieInfo {
    private static int cnt = 0;
    public static final int MAX_CNT = 1000;
    private int id;
    private String name;
    private double price;
    private String actor;
    private double score;

    public MovieInfo() {
    }

    public MovieInfo(int id, String name, double price, double score, String actor) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.score = score;
        this.actor = actor;
    }

    public static int getCnt() {
        return cnt;
    }

    public static void setCnt(int cnt) {
        MovieInfo.cnt = cnt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "MovieInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", actor='" + actor + '\'' +
                ", score=" + score +
                '}';
    }
}

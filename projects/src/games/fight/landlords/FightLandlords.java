package games.fight.landlords;

/* *
 * 项目：斗地主
 * 功能：完成做牌与洗牌功能
 */

public class FightLandlords {
    public static void main(String[] args) {
        Poker poker = new Poker();
        poker.makePoker();
        poker.washPoker(100);
        poker.printPoker();
    }

}

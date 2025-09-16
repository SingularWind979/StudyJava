package games.guess.num;/* *
 * 目标：
 * 猜数字小游戏
 * 功能：
 * 随机生成一个数字[1,100]，让用户猜，直到猜对为止
 * 如果猜对，则提示猜对了
 * 如果猜错，则提示猜大了或者猜小了
 *
 * TODO:
 *  加入GUI
 * */

import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        guess();
    }

    public static void guess() {
        int num = (int) (Math.random() * 100) + 1;
        int cnt = 0;
        Scanner sc = new Scanner(System.in);

        //这本质上是一个游戏，用死循环比较合适
        while (true) {
            System.out.println("请输入数字：");
            int inputNum = sc.nextInt();
            cnt++;
            if (inputNum == num) {
                System.out.println("恭喜你，猜对了！");
                sc.close();
                break;
            } else if (inputNum > num) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜小了");
            }
        }

        System.out.println("游戏结束");
        System.out.println("你一共猜了" + cnt + "次");
    }
}

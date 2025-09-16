package tools.health.calc;/* *
 * 目标：开发简单的健康计算器
 * 功能：
 * 接受用户输入的个人信息（年龄，性别，身高，体重）
 * 计算出用户的BMI和BMR，并根据标准给出评价
 *
 * TODO:
 *  加入GUI
 * */

public class HealthCalculator {
    public static void main(String[] args) {
        UserInfo user = new UserInfo();
        user.getUserInfo();
        user.calcBMI();
        user.judgeBMI();
        user.calcBMR();
        user.judgeBMR();
        user.printUserInfo();
    }
}

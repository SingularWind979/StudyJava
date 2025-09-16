package tools.math.calc;
/* *
 * 目标：
 * 设计一个可以进行基本数学运算（加减乘除）的计算器程序
 * 功能：
 * 用户输入两个数字，一个运算符，进行运算并输出结果
 *
 * TODO:
 *  加入是否继续使用计算器
 *  加入用户输入错误处理
 *  表达式扩充为后缀表达式
 *  支持更多的科学运算符
 *  加入GUI
 */

import java.util.Scanner;

public class MathCalculator {
    public static void main(String[] args) {
            Expression exp = getExpression();
            exp.result = calcExpression(exp);
            printResult(exp);
    }

    public static class Expression{
        double num1,num2;
        double result;
        char op;
        boolean isValid=true;
    }

    public static Expression getExpression(){
        Expression exp = new Expression();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入两个数字：");
        exp.num1 = sc.nextDouble();
        exp.num2 = sc.nextDouble();
        System.out.print("请输入运算符：");
        exp.op = sc.next().charAt(0);
        sc.close();
        return exp;
    }

    public static void printResult(Expression exp) {
        if (!exp.isValid) {
            System.out.println("输入的表达式有误！");
            return;
        }
        System.out.printf("%f %c %f = %f", exp.num1, exp.op, exp.num2, exp.result);
    }

    public static double calcExpression(Expression exp) {
        return switch (exp.op){
            case '+' -> exp.num1 + exp.num2;
            case '-' -> exp.num1 - exp.num2;
            case '*' -> exp.num1 * exp.num2;
            case '/' -> {
                if (exp.num2 == 0) {
                    exp.isValid = false;
                    yield 0;
                }
                yield exp.num1 / exp.num2;
            }
            default -> {
                exp.isValid = false;
                yield 0;
            }
        };
    }
}

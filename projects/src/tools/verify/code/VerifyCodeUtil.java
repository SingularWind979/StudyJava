package tools.verify.code;/* *
 * 目标：验证码生成器
 * 功能：给定位数生成验证码，验证码为数字或大小写字母组合
 *
 * TODO:
 *  运用字符集，而不是每位都随机生成
 *  加入GUI
 */

import java.util.Scanner;

public class VerifyCodeUtil {
    private static final String CHAR_SETS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private VerifyCodeUtil(){}
    public static int getLen(){
        System.out.println("请输入验证码长度：");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.close();
        return len;
    }

    public static String getCode(int len){
        StringBuilder code = new StringBuilder();

        for (int i = 0; i < len; i++) {
                int randIndex = (int)(Math.random()* CHAR_SETS.length());
                char randChar = CHAR_SETS.charAt(randIndex);
                code.append(randChar);
            }

        return code.toString();
    }
}

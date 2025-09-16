package tools.health.calc;

import java.util.Scanner;

public class UserInfo {
    static int age;
    static char sex;
    static double height;
    static double weight;
    static double bmi;
    static double bmr;

    public static void getUserInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("请输入你的个人信息：");
        System.out.println("请输入你的年龄：");
        age = sc.nextInt();
        System.out.println("请输入你的性别：(男/女)");
        sex = sc.next().charAt(0);
        System.out.println("请输入你的身高：(cm)");
        height = sc.nextDouble();
        System.out.println("请输入你的体重：(kg)");
        weight = sc.nextDouble();
        System.out.println("--------------------------------------------------");
        sc.close();


    }
    //输出个人信息
    public static void printUserInfo() {
        System.out.println("--------------------------------------------------");
        System.out.println("你的个人信息是：");
        System.out.println("年龄：" + age);
        System.out.println("性别：" + sex);
        System.out.println("身高：" + height);
        System.out.println("体重：" + weight);
        System.out.println("BMI：" + bmi);
        System.out.println("BMR：" + bmr);
        System.out.println("--------------------------------------------------");
    }

    //BMI公式
    //BMI=w/h^2
    public static void calcBMI() {
        bmi = weight / Math.pow(height, 2);
    }

    //HB公式
    //男性 BMR = (13.397w + 4.799h - 5.677a + 88.362) kcal/天
    //女性 BMR = (9.247w + 3.098h - 4.330a + 447.593) kcal/天
    public static void calcBMR() {
        bmr = switch (sex) {
            case '男' -> (13.397 * weight + 4.799 * height - 5.677 * age + 88.362);
            case '女' -> (9.247 * weight + 3.098 * height - 4.330 * age + 447.593);
            default -> -1;
        };
    }

    //判断BMI
    //18.5以下为过低
    //18.5-24.9为正常
    //25-29.9为过重
    //30以上为肥胖
    public static void judgeBMI(){
        if(bmi<18.5){
            System.out.println("BMI过低");
        }else if(bmi>=18.5&&bmi<24.9){
            System.out.println("BMI正常");
        }else if(bmi>=24.9&&bmi<30){
            System.out.println("BMI过重");
        }else{
            System.out.println("BMI肥胖");
        }
    }

    //判断BMR
    //1000以下为过低
    //1000-2000为正常
    //2000-3000为过高
    //3000以上为超高
    public static void judgeBMR(){
        if(bmr<1000){
            System.out.println("BMR过低");
        }else if(bmr>=1000&&bmr<2000){
            System.out.println("BMR正常");
        }else if(bmr>=2000&&bmr<3000){
            System.out.println("BMR过高");
        }else{
            System.out.println("BMR超高");
        }
    }
}

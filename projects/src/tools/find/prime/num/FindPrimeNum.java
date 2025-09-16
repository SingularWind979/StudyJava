package tools.find.prime.num;/* *
 * 找出1000以内的素数
 *
 * TODO:
 *  封装输入输出
 *  封装类
 *  实现筛法
 */

public class FindPrimeNum {
    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 101; i < 201; i++) {
            if (isPrime(i)){
                System.out.println(i);
                cnt++;
            }
        }
        System.out.println("素数个数：" + cnt);
    }

    public static  boolean isPrime(int n){
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}

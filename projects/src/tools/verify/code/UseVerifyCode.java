package tools.verify.code;

public class UseVerifyCode {
    public static void main(String[] args) {

    }

    public static void login(){
        int len = VerifyCodeUtil.getLen();
        String code = VerifyCodeUtil.getCode(len);
    }
}

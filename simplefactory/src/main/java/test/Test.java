package test;

import factory.LoginFactory;
import service.Login;

/**
 * 模拟servlet接收前端请求，由工厂获取具体登录类型
 */
public class Test {
    public static void main(String[] args) {
        String loginType = "password";
        String telPhone = "13799990808";
        String password = "password";
        Login login = LoginFactory.getLogin(loginType);
        boolean bool = login.verify(telPhone, password);
        if (bool) {
            /**
             * 业务逻辑
             */
        } else {
            /**
             * 业务逻辑
             */
        }
    }
}

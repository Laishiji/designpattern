package factory;

import service.Login;
import service.impl.DomainLogin;
import service.impl.PasswordLogin;

public class LoginFactory {
    public static Login getLogin(String loginType){
        if(loginType.equals("password"))
            return new PasswordLogin();
        else if(loginType.equals("passcode"))
            return new DomainLogin();
        else
            throw new RuntimeException("没有找到登录类型");
    }
}

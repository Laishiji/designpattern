package service.impl;

import service.Login;

public class DomainLogin implements Login {
    @Override
    public boolean verify(String telPhone, String password) {
        /**
         * 业务逻辑
         */
        return true;
    }
}

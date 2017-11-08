package com.stackify.guest.springmvc.model;

/**
 * Created by john on 08/11/17.
 */
public class LoginData {

    private String login;
    private String password;

    public LoginData() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

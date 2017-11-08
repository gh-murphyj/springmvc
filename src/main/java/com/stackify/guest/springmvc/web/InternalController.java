package com.stackify.guest.springmvc.web;


import com.stackify.guest.springmvc.model.LoginData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;

/**
 * Created by john on 08/11/17.
 *
 */
public class InternalController {


    private static final String LOGIN = "jack";
    private static final String PASSWORD = "halloween";

    @GetMapping("/")
    public String hello() {
        return "login";
    }

    @PostMapping("/login")
    public ModelAndView login(LoginData loginData) {

        if (LOGIN.equals(loginData.getLogin()) && PASSWORD.equals(loginData.getPassword())) {
            return new ModelAndView("success", Collections.singletonMap("login", loginData.getLogin()));
        } else {
            return new ModelAndView("failure", Collections.singletonMap("login", loginData.getLogin()));
        }

    }
}

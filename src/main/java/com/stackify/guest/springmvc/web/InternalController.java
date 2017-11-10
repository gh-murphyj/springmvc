package com.stackify.guest.springmvc.web;


import com.stackify.guest.springmvc.model.LoginData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;

/**
 * Created by john on 08/11/17.
 *
 */
@Controller
public class InternalController {


    private static final String LOGIN = "jack";
    private static final String PASSWORD = "halloween";

    /* doing a get on localhost:8080/ will return login which ThymeLeaf will in turn us to return login.html*/
    @GetMapping("/")
    public String hello() {
        return "login";
    }


    /* doing a post on localhost:8080/login will cause Spring MVC to map the fields in the form to the fields in
       LoginData. Based on whether the login credentals are correct or not, a ModelAndView object is returned with
       the login name in the model and the view name of success or failure. ThymeLeaf can the map this to the
       success.html and failure.html templates and furthermore use the values in passed in the model to populate
       the html templates. */
    @PostMapping("/login")
    public ModelAndView login(LoginData loginData) {

        if (LOGIN.equals(loginData.getLogin()) && PASSWORD.equals(loginData.getPassword())) {
            return new ModelAndView("success", Collections.singletonMap("login", loginData.getLogin()));
        } else {
            return new ModelAndView("failure", Collections.singletonMap("login", loginData.getLogin()));
        }

    }
}

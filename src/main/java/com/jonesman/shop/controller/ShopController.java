package com.jonesman.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {

    @GetMapping("/")
        public String showHomePage(){
            return "index";
        }
        @GetMapping("/retail")
    public String showRetailPage(){
            return "retail/index";
        } @GetMapping("/wholesale")
        public String showWholeSalePage(){
            return "wholesale/index";
        } @GetMapping("/auth/login")
        public String showLoginPage(){
            return "auth/login";
        }

        @GetMapping("/auth/signup")
        public String showSignUpPage(){
            return "auth/signup";
        }
 



}

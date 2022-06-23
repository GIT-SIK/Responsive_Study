package com.study.responsive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userController {

    /* 로그인 모달 연습 */
    @GetMapping("/login")
    public String login (Model model){
        return "user/login";
    }
}

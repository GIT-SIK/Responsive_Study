package com.study.responsive.controller;

import com.study.responsive.service.IndexService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// final 사용을 위한 어노테이션
@RequiredArgsConstructor
public class IndexController {

    private final IndexService indexService;

    @GetMapping({"/", ""})
    public String index (Model model){
        return "index";
    }
}

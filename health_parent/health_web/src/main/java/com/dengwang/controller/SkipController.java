package com.dengwang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/skip")
public class SkipController {

    @RequestMapping("/main")
    public String tiaozhuan(){
        return "main";
    }
    @RequestMapping("/checkitem")
    public String checkitem(){
        return "checkitem";
    }


}

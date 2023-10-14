package com.example.plac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class hello {
    @GetMapping("/check")
    public String check_nickname(String nickName){
        nickName = "junho";
        Random rand = new Random();
        int randomNum = rand.nextInt(9000) + 1000; // 1000 ~ 9999 사이의 숫자 생성

        nickName += randomNum;


        return "hello";
    }

}

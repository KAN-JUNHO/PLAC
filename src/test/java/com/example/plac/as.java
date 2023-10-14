package com.example.plac;

import java.util.*;

public class as {

    public static void main(String[] args) {
        String nickName = "junho";
        Random rand = new Random();
        int randomNum = rand.nextInt(9000) + 1000; // 1000 ~ 9999 사이의 숫자 생성

        nickName += randomNum;
        System.out.println(nickName);
    }
}

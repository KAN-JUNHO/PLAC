package com.example.plac;

import com.example.plac.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.plac.repository.UserRepository;

import java.util.Random;

@SpringBootTest
class PlacApplicationTests {

    @InjectMocks
    private UserService userService;  // UserService 클래스를 가정합니다.

    @Mock
    private UserRepository userRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void a(){



        String nickName = "junho";
        Random rand = new Random();
        int randomNum = rand.nextInt(9000) + 1000; // 1000 ~ 9999 사이의 숫자 생성

        nickName += randomNum;



    }
    @Test
    void b(){
        @InjectMocks
        private UserService userService;  // UserService 클래스를 가정합니다.

        @Mock
        private UserRepository userRepository;
    }
}

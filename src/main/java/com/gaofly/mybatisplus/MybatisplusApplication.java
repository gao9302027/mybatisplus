package com.gaofly.mybatisplus;

import com.gaofly.mybatisplus.service.UserserviceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MybatisplusApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MybatisplusApplication.class, args);
        UserserviceImpl bean = run.getBean(UserserviceImpl.class);
    }

}

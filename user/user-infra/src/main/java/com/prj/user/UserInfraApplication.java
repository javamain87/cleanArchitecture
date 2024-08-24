package com.prj.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.prj"})
public class UserInfraApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserInfraApplication.class, args);
    }

}

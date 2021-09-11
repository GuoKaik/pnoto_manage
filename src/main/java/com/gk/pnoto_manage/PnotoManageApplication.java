package com.gk.pnoto_manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gk.pnoto_manage.user.userDao")
public class PnotoManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(PnotoManageApplication.class, args);
    }
}

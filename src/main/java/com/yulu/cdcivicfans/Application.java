package com.yulu.cdcivicfans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Yulu on 2017/9/5.
 */
//@MapperScan("com.yulu.cdcivicfans.dao")（这种方式只需要加一次），
// 或者在dao类上面添加注解@Mapper（这种方式要在每个dao上面都要加一次）
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

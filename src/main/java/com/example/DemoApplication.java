package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Demo Application
 *
 * Class級別的註解，根據maven依賴的jar來自動猜測完成正確的spring的對應配置，
 * 只要引入了spring-boot-starter-web的依賴，預設會自動配置Spring MVC和tomcat容器
 */
@SpringBootApplication
@RestController
public class DemoApplication {

    //@RequestMapping("/")
    //@ResponseBody
    //public String home() {
    //    return "Home Page";
    //}
    //
    //@GetMapping("/hello") //?name=Tist
    //public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
    //    return String.format("Hello %s!", name);
    //}

//    private static void doSomething() {
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + "×" + i + "=" + i * j + "\t");
//            }
//            System.out.println();
//        }
//    }

    public static void main(String[] args) {
         //啟動SpringBoot的選項，並將自身的類別DemoApplication.class注入，args表可加入啟動多個參數
        SpringApplication.run(DemoApplication.class, args);
//        doSomething();
    }
}

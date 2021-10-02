package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.filter.HiddenHttpMethodFilter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 朱志臣
 * @Date: 2021/09/29/19:17
 * @Description:
 */


/*
* @SpringBootApplication用来标注一个主程序，说明是一个springboot应用
* */
@SpringBootApplication
public class HelloWorld {
    public static void main( String[] args ) {
        SpringApplication.run(HelloWorld.class, args);
    }
}

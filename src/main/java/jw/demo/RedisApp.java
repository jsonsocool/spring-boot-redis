package jw.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
public class RedisApp {
    public static void main(String[] args) {

        SpringApplication.run(RedisApp.class);

        System.out.println("Hello World!");
    }

}

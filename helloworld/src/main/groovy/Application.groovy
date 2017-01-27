package com.haiyanzhang.springboottest.helloworld
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Created by haiyan zhang on 1/27/2017.
 */

@SpringBootApplication
class Application {
    static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class)
        println "Hello World"
    }
}

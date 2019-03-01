package com.jeremy.eureka_server_demo;/**
 Created by 胡杰 on 2019/2/27. */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * FileName: com.jeremy.eureka_server_demo.EurekaServerApplication.java
 * Author: Jeremy_Hu
 * Date: 2019/2/27 下午11:49
 */



@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
    public static void main(String args[]){
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}

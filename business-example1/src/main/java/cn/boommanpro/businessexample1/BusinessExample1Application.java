package cn.boommanpro.businessexample1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class BusinessExample1Application {

    public static void main(String[] args) {
        SpringApplication.run(BusinessExample1Application.class, args);
    }

}

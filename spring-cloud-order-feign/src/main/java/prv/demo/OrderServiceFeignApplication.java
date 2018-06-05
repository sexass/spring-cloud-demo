package prv.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Author:郭友文
 * @Data:2018/6/5 10:52
 * @Description:
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class OrderServiceFeignApplication  {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceFeignApplication.class,args);
    }
}

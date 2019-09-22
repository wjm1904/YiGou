package cmo.qf.pictures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PicturesApplication {
    public static void main(String[] args) {
        SpringApplication.run(PicturesApplication.class,args);
    }
}

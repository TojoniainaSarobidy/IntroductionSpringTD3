package tojoniaina.hei.td3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"entity", "repository", "service", "controller"})
public class Td3Application {

    public static void main(String[] args) {
        SpringApplication.run(Td3Application.class, args);
    }

}

package home.example.user.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.cloud.netflix.feign.EnableFeignClients;

@ComponentScan("home.example.user")
@EnableMongoRepositories(basePackages = "home.example.user.repository")
@SpringBootApplication
@EnableDiscoveryClient
//@EnableFeignClients
public class UserApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(UserApplication.class, args);
    }

}

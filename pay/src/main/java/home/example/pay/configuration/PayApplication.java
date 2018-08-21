package home.example.pay.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@ComponentScan("home.example.pay")
@EnableMongoRepositories(basePackages = "home.example.pay.repository")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "home.example.pay.client")
public class PayApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(PayApplication.class, args);
    }

//    public static void main(String[] args) {
//       new SpringApplicationBuilder(PayApplication.class)
//                .web(true)
//                .run(args);
//    }


}

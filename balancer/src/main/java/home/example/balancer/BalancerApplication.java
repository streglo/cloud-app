package home.example.balancer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaServer
public class BalancerApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(BalancerApplication.class, args);
    }


//    public static void main(String[] args) {
//       new SpringApplicationBuilder(BalancerApplication.class)
//                .web(true)
//                .run(args);
//    }

}

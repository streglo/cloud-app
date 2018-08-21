package home.example.pay.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.netflix.feign.EnableFeignClients;
//import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/pay")
public class PayController {

    @Autowired
    HelloClient client;

    @RequestMapping("/")
    public String hello() {
        return client.hello();
    }
    @FeignClient("hello-service")
    interface HelloClient {
        @RequestMapping(value = "/", method = GET)
        String hello();
    }

//    @Autowired
//    private UserControllerClient userControllerClient;
//
//    @RequestMapping("/users/{name}")
//    public User getUser(@PathVariable("name") String name) {
//        User user = userControllerClient.get(name);
//
//        return user;
//    }
//
//    @LoadBalanced
//    @Bean
//    public RestTemplate getRestTemplate(){
//        return new RestTemplate();
//    }

}

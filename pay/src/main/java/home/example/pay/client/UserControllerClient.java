package home.example.pay.client;

import home.example.domain.User;
//import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "user")
public interface UserControllerClient {

    @RequestMapping("/users/{name}")
    public User get(@PathVariable("name") String username);

}

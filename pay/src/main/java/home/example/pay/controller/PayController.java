package home.example.pay.controller;

import home.example.domain.User;
import home.example.pay.client.UserControllerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")
public class PayController {

    @Autowired
    private UserControllerClient userControllerClient;

    @RequestMapping("/users/{name}")
    public User getUser(@PathVariable("name") String name) {
        User user = userControllerClient.get(name);

        return user;
    }
    
}

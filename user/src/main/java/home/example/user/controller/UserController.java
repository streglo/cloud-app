package home.example.user.controller;

import java.security.Principal;
import java.util.Collection;

import home.example.domain.User;
import home.example.user.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping
    public Collection<User> users() {
        LOG.debug("Get all users");
        return userService.findAll();
    }

    @RequestMapping("/{name}")
    public User get(@PathVariable("name") String username) {
        return userService.find(username);
    }

    @RequestMapping(value = "/current", method = RequestMethod.GET)
    @ResponseBody
    public Principal getUser(Principal principal) {
        return principal;
    }


}

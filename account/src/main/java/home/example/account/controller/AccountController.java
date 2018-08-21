package home.example.account.controller;

import java.util.Collection;

import home.example.account.service.IAccountService;
import home.example.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("/")
    public Collection<Account> accounts() {
        return accountService.findAll();
    }

    @RequestMapping("/{number}")
    public Account get(@PathVariable("number") String number) {
        return accountService.find(number);
    }

}

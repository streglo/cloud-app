package home.example.account.service;

import java.util.Collection;

import home.example.domain.Account;

public interface IAccountService {

    Collection<Account> findAll();

    Account findByUsername(String username);

    Account find(String number);

}

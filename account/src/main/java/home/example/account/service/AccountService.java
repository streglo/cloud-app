package home.example.account.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import home.example.account.repository.AccountRepository;
import home.example.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements IAccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Collection<Account> findAll() {
        List<Account> result = new ArrayList<>();
        accountRepository.findAll().forEach(account -> result.add(account));

        return result;
    }

    @Override
    public Account findByUsername(String username) {
        Optional<Account> optionalAccount = findAll().stream().filter(account -> account.getUsername().equals(username))
                .findFirst();
        optionalAccount.orElseThrow(() -> new RuntimeException("Account not found"));

        return optionalAccount.get();
    }

    @Override
    public Account find(String number) {
        Optional<Account> optionalAccount = accountRepository.findById(number);
        optionalAccount.orElseThrow(() -> new RuntimeException("Account not found"));

        return optionalAccount.get();
    }

}

package com.mycompany.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/account")
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestParam String name
            , @RequestParam String email) {
        Account n = new Account();
        n.setName(name);
        n.setEmail(email);
        accountRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<Account> getAllUsers() {
        return accountRepository.findAll();
    }
}

package telephone.exchange.station.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import telephone.exchange.station.services.AccountService;

@RequestMapping("/accounts")
@Controller
public class AccountController {

    private final AccountService accountService;
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listAccounts(Model model) {
        model.addAttribute ("accounts", accountService.findAll());
        return "accounts/index";
    }
    @RequestMapping("/find")
    public String findOwners(){
        return "notimplemented";
    }
}

package telephone.exchange.station.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/accounts")
@Controller
public class AccountController {
    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listAccounts() {
        return "accounts/index";
    }
}

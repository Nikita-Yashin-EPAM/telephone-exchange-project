package telephone.exchange.station.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
    @RequestMapping({"/products", "/products/index", "/products/index.html"})
    public String listProducts(){
        return "products/index";
    }
}

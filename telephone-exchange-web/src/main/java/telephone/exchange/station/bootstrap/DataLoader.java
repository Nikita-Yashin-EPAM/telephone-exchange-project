package telephone.exchange.station.bootstrap;
// one of Spring boot way to initialise data CommandLineRunner
// Component makes class a Spring Bean now this is registered in Spring context, Spring execute a run method when
// context will be ready(CommandLineRunner)
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import telephone.exchange.station.model.Account;
import telephone.exchange.station.model.Product;
import telephone.exchange.station.services.AccountService;
import telephone.exchange.station.services.ProductService;

@Component
public class DataLoader implements CommandLineRunner {

    private final AccountService accountService;
    private final ProductService productService;

    // in legacy code there could be @Autowired annotation, nowadays app needs annotation and constructor
    public DataLoader(AccountService accountService, ProductService productService) {
        this.accountService = accountService;
        this.productService = productService;
    }

    @Override
    public void run(String... args) throws Exception {



        Product product1 = new Product();
        product1.setName("Local calls");

        productService.save(product1);

        Product product2 = new Product();
        product2.setName("Abroad calls");

        productService.save(product2);

        System.out.println("Products loaded");

        Account account1 = new Account();
        account1.setFirstName("Nikita");
        account1.setLastName("Yashin");
        account1.getProducts().add(product2);

        accountService.save(account1);

        Account account2 = new Account();
        account2.setFirstName("Vladimir");
        account2.setLastName("Magerov");
        account2.getProducts().add(product1);

        accountService.save(account2);


        Account account3 = new Account();
        account3.setFirstName("Evgeniy");
        account3.setLastName("Kornyshev");
        account3.getProducts().add(product2);

        accountService.save(account3);

        System.out.println("Accounts loaded");


    }
}

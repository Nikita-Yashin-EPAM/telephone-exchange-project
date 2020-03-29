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

        Account account1 = new Account();
        account1.setId(1L);
        account1.setFirstName("Nikita");
        account1.setLastName("Yashin");

        accountService.save(account1);

        Account account2 = new Account();
        account1.setId(2L);
        account1.setFirstName("Vladimir");
        account1.setLastName("Magerov");

        accountService.save(account2);


        Account account3 = new Account();
        account1.setId(3L);
        account1.setFirstName("Evgeniy");
        account1.setLastName("Kornyshev");

        accountService.save(account3);

        System.out.println("Accounts loaded");


        Product product1 = new Product();
        product1.setId(1L);
        product1.setName("Local calls");

        productService.save(product1);

        Product product2 = new Product();
        product1.setId(2L);
        product1.setName("Abroad calls");

        productService.save(product2);

        System.out.println("Products loaded");

    }
}

package telephone.exchange.station.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import telephone.exchange.station.model.Account;
import telephone.exchange.station.repositories.AccountRepository;
import telephone.exchange.station.repositories.ProductRepository;
import telephone.exchange.station.services.AccountService;

import java.util.HashSet;
import java.util.Set;

/**
*this class provides different implementation of AccountService via spring data jpa
*/
@Service
@Profile("spingdatajpa")
 public class AccountSDJpaService implements AccountService {
    private final AccountRepository accountRepository;
    private final ProductRepository productRepository;

    public AccountSDJpaService(AccountRepository accountRepository, ProductRepository productRepository) {
        this.accountRepository = accountRepository;
        this.productRepository = productRepository;
    }

    @Override
    public Account findByLastName(String lastName) {
        return accountRepository.findByLastName(lastName);
    }

    @Override
    public Set<Account> findAll() {
        Set<Account> accounts = new HashSet<>();
        accountRepository.findAll().forEach(accounts::add);
        return accounts;
    }

    @Override
    public Account findByID(Long aLong) {
        return accountRepository.findById(aLong).orElse(null);
    }

    @Override
    public Account save(Account object) {
        return accountRepository.save(object);
    }

    @Override
    public void delete(Account object) {
        accountRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        accountRepository.deleteById(aLong);
    }
}

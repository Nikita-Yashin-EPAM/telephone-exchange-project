package telephone.exchange.station.services.map;

import org.springframework.stereotype.Service;
import telephone.exchange.station.model.Account;
import telephone.exchange.station.services.AccountService;

import java.util.Set;
@Service
public class AccountServiceMap extends AbstractMapService<Account, Long> implements AccountService{

    @Override
    public Set<Account> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Account object) {
        super.delete(object);
    }

    @Override
    public Account findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public Account save(Account object) {
        return super.save(object);
    }

    @Override
    public AccountService findByLastName(String lastName) {
        return null;
    }
}

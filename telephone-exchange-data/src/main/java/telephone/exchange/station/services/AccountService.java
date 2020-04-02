package telephone.exchange.station.services;

import org.springframework.stereotype.Service;
import telephone.exchange.station.model.Account;
@Service
public interface AccountService extends CrudService<Account, Long>{
    Account findByLastName(String lastName);
}

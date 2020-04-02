package telephone.exchange.station.repositories;

import org.springframework.data.repository.CrudRepository;
import telephone.exchange.station.model.Account;

public interface AccountRepository extends CrudRepository<Account, Long> {
    Account findByLastName(String lastName);
}
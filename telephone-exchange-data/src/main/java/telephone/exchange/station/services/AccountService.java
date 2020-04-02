package telephone.exchange.station.services;

import telephone.exchange.station.model.Account;


public interface AccountService extends CrudService<Account, Long>{
    Account findByLastName(String lastName);
}

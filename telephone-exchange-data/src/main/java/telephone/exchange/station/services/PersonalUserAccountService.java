package telephone.exchange.station.services;

import telephone.exchange.station.model.Account;

public interface PersonalUserAccountService extends CrudService<Account, Long>{

    PersonalUserAccountService findByLastName(String lastName);
}

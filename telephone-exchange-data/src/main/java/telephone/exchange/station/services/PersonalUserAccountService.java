package telephone.exchange.station.services;

import telephone.exchange.station.model.PersonalCustomerAccount;

public interface PersonalUserAccountService extends CrudService<PersonalCustomerAccount, Long>{

    PersonalUserAccountService findByLastName(String lastName);
}

package telephone.exchange.station.services;

import java.util.Set;

public interface PersonalUserAccountService {

    PersonalUserAccountService findByLastName(String lastName);

    PersonalUserAccountService findBy(Long id);

    PersonalUserAccountService save(PersonalUserAccountService personalUserAccountService);

    Set<PersonalUserAccountService> findAll();
}

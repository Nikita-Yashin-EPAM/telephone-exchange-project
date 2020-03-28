package telephone.exchange.station.services;

import telephone.exchange.station.model.BusinessUserAccount;

import java.util.Set;

public interface BusinessUserAccountService {
    BusinessUserAccountService findBy(Long id);

    BusinessUserAccountService save(BusinessUserAccountService businessUserAccountService);

    Set<BusinessUserAccount> findAll();
}

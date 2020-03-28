package telephone.exchange.station.services.map;

import telephone.exchange.station.model.BusinessCustomerAccount;
import telephone.exchange.station.services.CrudService;

import java.util.Set;

public class BusinessUserAccountServiceMap extends AbstractMapService<BusinessCustomerAccount, Long>
        implements CrudService<BusinessCustomerAccount, Long>
{

    @Override
    public Set<BusinessCustomerAccount> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(BusinessCustomerAccount object) {
        super.delete(object);
    }

    @Override
    public BusinessCustomerAccount findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public BusinessCustomerAccount save(BusinessCustomerAccount object) {
        return super.save(object.getId(), object);
    }
}

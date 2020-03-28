package telephone.exchange.station.services.map;

import telephone.exchange.station.model.PersonalCustomerAccount;
import telephone.exchange.station.services.CrudService;

import java.util.Set;

public class PersonalUserAccountServiceMap extends AbstractMapService<PersonalCustomerAccount, Long>
implements CrudService<PersonalCustomerAccount, Long> {

    @Override
    public Set<PersonalCustomerAccount> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PersonalCustomerAccount object) {
        super.delete(object);
    }

    @Override
    public PersonalCustomerAccount findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public PersonalCustomerAccount save(PersonalCustomerAccount object) {
        return super.save(object.getId(), object);
    }
}

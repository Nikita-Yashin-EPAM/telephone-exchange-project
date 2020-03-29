package telephone.exchange.station.services.map;

import telephone.exchange.station.model.Account;
import telephone.exchange.station.services.CrudService;

import java.util.Set;

public class PersonalUserAccountServiceMap extends AbstractMapService<Account, Long>
implements CrudService<Account, Long> {

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
        return super.save(object.getId(), object);
    }
}

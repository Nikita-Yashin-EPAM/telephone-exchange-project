package telephone.exchange.station.services.map;

import telephone.exchange.station.services.CrudService;

import java.util.Set;

public class BusinessUserAccountServiceMap extends AbstractMapService<BusinessPersonAccount, Long>
        implements CrudService<BusinessPersonAccount, Long>
{

    @Override
    public Set<BusinessPersonAccount> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(BusinessPersonAccount object) {
        super.delete(object);
    }

    @Override
    public BusinessPersonAccount findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public BusinessPersonAccount save(BusinessPersonAccount object) {
        return super.save(object.getId(), object);
    }
}

package telephone.exchange.station.services.map;

import telephone.exchange.station.model.Product;
import telephone.exchange.station.services.CrudService;

import java.util.Set;

public class ProductServiceMap extends AbstractMapService<Product, Long> implements CrudService<Product, Long> {

    @Override
    public Set<Product> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Product object) {
        super.delete(object);
    }

    @Override
    public Product findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public Product save(Product object) {
        return super.save(object.getId(), object);
    }
}

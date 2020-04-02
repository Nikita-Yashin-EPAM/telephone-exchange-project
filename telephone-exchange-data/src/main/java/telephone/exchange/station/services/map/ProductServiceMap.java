package telephone.exchange.station.services.map;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import telephone.exchange.station.model.Product;
import telephone.exchange.station.services.ProductService;

import java.util.Set;
@Service
@Primary
public class ProductServiceMap extends AbstractMapService<Product, Long> implements ProductService {

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
        return super.save(object);
    }
}

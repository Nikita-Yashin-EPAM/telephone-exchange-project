package telephone.exchange.station.repositories;

import org.springframework.data.repository.CrudRepository;
import telephone.exchange.station.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
}

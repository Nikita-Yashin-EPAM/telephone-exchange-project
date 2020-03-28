package telephone.exchange.station.services;

import java.util.Set;

public interface ProductService {

    ProductService findBy(Long id);

    ProductService save(ProductService productService);

    Set<ProductService> findAll();
}

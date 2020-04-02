package telephone.exchange.station.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import telephone.exchange.station.model.Product;
import telephone.exchange.station.repositories.ProductRepository;
import telephone.exchange.station.services.ProductService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class ProductSDJpaService implements ProductService {
    private final ProductRepository productRepository;
    public ProductSDJpaService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Set<Product> findAll() {
        Set<Product> products = new HashSet<>();
        productRepository.findAll().forEach(products::add);
        return products;
    }

    @Override
    public Product findByID(Long aLong) {
        return productRepository.findById(aLong).orElse(null);
    }

    @Override
    public Product save(Product object) {
        return productRepository.save(object);
    }

    @Override
    public void delete(Product object) {
        productRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        productRepository.deleteById(aLong);
    }
}

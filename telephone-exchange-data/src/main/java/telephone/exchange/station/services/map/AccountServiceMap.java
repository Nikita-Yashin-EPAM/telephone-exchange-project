package telephone.exchange.station.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import telephone.exchange.station.model.Account;
import telephone.exchange.station.model.Product;
import telephone.exchange.station.services.AccountService;
import telephone.exchange.station.services.ProductService;

import java.util.Set;
@Service
@Profile({"default", "map"})
public class AccountServiceMap extends AbstractMapService<Account, Long> implements AccountService{

    private final ProductService productService;

    public AccountServiceMap(ProductService productService) {
        this.productService = productService;
    }

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
        if(object != null){
            if(object.getProducts() != null){
                object.getProducts().forEach(product -> {
                    if(product.getId() == null){
                        Product savedProduct = productService.save(product);
                        product.setId(savedProduct.getId());
                    }
                });
            }
            return super.save(object);
        }else {
            return null;
        }


    }

    @Override
    public Account findByLastName(String lastName) {
        return null;
    }
}

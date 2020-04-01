package telephone.exchange.station.model;

import java.util.HashSet;
import java.util.Set;

public class Account extends Person {
    // Account is not a person, but business logic is a farther and not clear issue))
    private Set<Product> products = new HashSet<>();

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}

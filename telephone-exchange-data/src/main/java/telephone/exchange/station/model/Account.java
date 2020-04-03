package telephone.exchange.station.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;
@Setter
@Getter
@NoArgsConstructor

@Entity
@Table(name = "accounts")
public class Account extends Person {

    @Builder
    public Account(Long id, String firstName, String lastName, Set<Product> products){
        super(id, firstName, lastName);
        this.products = products;
    }
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "account")
    private Set<Product> products = new HashSet<>();
}

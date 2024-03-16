package fr.uga.l3miage.tp1.exo3;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name="product_entity")
public class ProductEntity {
    @Id
    @Column(name = "code barre")
    private String bar_code_number;

    private String name;

    @Column(name = "produit consommable")
    private boolean consumable;

    @OneToMany
    private Set<BrandEntity> brandOfProducts;
}

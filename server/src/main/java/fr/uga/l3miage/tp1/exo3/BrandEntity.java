package fr.uga.l3miage.tp1.exo3;

import fr.uga.l3miage.tp1.exo3.enums.BrandType;

import javax.persistence.*;

@Entity
@Table(name="brand_miage")
public class BrandEntity {

    @Id
    private String company_name;

    @Column(name="numeroSiret", updatable = false, nullable = false)
    private String siretNumber;

    @Enumerated(EnumType.STRING)
    private BrandType type;

    @ManyToOne
    private ProductEntity product;

}

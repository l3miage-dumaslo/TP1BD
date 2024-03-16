package fr.uga.l3miage.tp1.exo3;

import org.hibernate.type.AssociationType;

import javax.persistence.*;

@Entity
public class AssociationEntity {
    @Id
    private String name;

    @Column(nullable = false)
    private String presidentName;

    @Column(nullable = false)
    private String treasurerName;

    private String secretaryName;

    @Enumerated(EnumType.STRING)
    private AssociationType associationType;

    @ManyToOne
    private FederationEntity federationEntity;
}

package fr.uga.l3miage.tp1.exo3;


import fr.uga.l3miage.tp1.exo3.enums.AssociationType;

import javax.persistence.*;
import java.util.Set;

@Entity
public class FederationEntity {
    @Id
    private String name;

    boolean isFageMenbership(){
        for (AssociationEntity element : assoE) {
            if(element.equals(this.name)) {
                return true;
            }
        }
        return false;
    }

    @OneToMany(mappedBy = "AssociationEntity")
    private Set<AssociationEntity> assoE;
}

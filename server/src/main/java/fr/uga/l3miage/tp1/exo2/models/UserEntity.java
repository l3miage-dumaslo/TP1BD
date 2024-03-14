package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.models.enums.SessionEntity;

import javax.persistence.*;
import java.time.OffsetDateTime;


@Entity
@Table(name = "UserEntity")
public class UserEntity {

    @Id
    @Column(name = "id_user")
    private long idUser;

    @Column(name = "sso")
    private  boolean SSO;

    @Column(name = "lestConnexion")
    private OffsetDateTime lastConnexion;

    @OneToOne(mappedBy = "Session")
    private SessionEntity session;
}

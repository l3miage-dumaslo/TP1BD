package fr.uga.l3miage.tp1.exo2.models;

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

    @OneToOne
    private SessionEntity session;
}

package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;

@Entity
@Table(name="netflix_account")
public class NetflixAccountEntity {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="nb_devices")
    private int nb_devices;

    @Column(name="typeAccount")
    private String typeAccount;

    @OneToOne
    @Column(name="uuid_user")
    private NetflixUserEntity uuid_user;

}

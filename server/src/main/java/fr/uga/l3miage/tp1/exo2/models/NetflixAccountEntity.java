package fr.uga.l3miage.tp1.exo2.models;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name="netflix_account")
public class NetflixAccountEntity {

    @Id
    @Column(name="id")
    private long id;

    @Column(name="nb_devices")
    private int nb_devices;

    @Enumerated(EnumType.STRING)
    @Column(name="type_Account")
    private String typeAccount;

    @OneToOne
    private NetflixUserEntity uuid_user;


}

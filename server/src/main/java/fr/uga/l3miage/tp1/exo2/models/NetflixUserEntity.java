package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.text.DateFormat;

@Entity
@Table(name="netflix_user")
public class NetflixUserEntity {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "firstname")
    private String firstname;

    @Enumerated(EnumType.STRING)
    @Column(name = "sex")
    private String sex;

    @Column(name = "birthDate")
    private DateFormat birthDate;
}

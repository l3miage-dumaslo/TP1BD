package fr.uga.l3miage.tp1.exo2.models.enums;

import fr.uga.l3miage.tp1.exo2.models.UserEntity;
import org.springframework.boot.SpringApplication;

import javax.persistence.*;
import java.util.UUID;


@Entity
@Table(name = "SessionEntity")
public class SessionEntity {

    @Id
    @Column(name = "idSession")
    private UUID idSession;


    @Column(name = "lasteCommand")
    private String lasteCommand;

    @Column(name = "currentDir")
    private String currentDir;

    @Column(name = "lock")
    private boolean lock;

    @OneToOne
    private UserEntity user;
}

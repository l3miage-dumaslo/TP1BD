package fr.uga.l3miage.tp1.exo1.models;

import fr.uga.l3miage.tp1.exo1.models.enums.CylinderNumber;
import fr.uga.l3miage.tp1.exo1.models.enums.PowerType;
import fr.uga.l3miage.tp1.exo1.models.enums.ShifterType;
import fr.uga.l3miage.tp1.exo1.models.enums.WeightUnity;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.time.LocalDate;

public class BikeEntity {
    @Id
    @Column(name = "immat",length = 8)
    private String immatriculation;
    @Column(name = "capacity")
    private Integer torque;
    @Column(name ="cylinderNumber")
    @Enumerated(EnumType.STRING)
    private CylinderNumber cylinderNumber;
    @Column(name= "automatic")
    private Boolean automatic;
    @Column(name = "shifter")
    private Boolean shifter;
    @Column(name= "shifterType")
    @Enumerated(EnumType.STRING)
    private ShifterType shifterType;

    @Column(name="circulationDate")
    private LocalDate circulationDate;
}

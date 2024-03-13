package fr.uga.l3miage.tp1.exo1.models.enums;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public enum WeightUnity {
    KG, // unité en européen
    POUND, // unité anglaise
    LIVRE // unité anglaise
}

package tn.esprit.projetkaddem.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDepart;
    private String nomDepart;
    @OneToMany(cascade =CascadeType.ALL)
    @JoinColumn(name = "idDepart")
    @JsonIgnoreProperties({"dept"})
    List<Etudiant> etudiants;
}

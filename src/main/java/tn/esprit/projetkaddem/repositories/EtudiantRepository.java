package tn.esprit.projetkaddem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projetkaddem.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant , Integer> {
}

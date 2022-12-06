package tn.esprit.projetkaddem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projetkaddem.entities.Contrat;

public interface ContratRepository extends JpaRepository<Contrat, Integer> {
}

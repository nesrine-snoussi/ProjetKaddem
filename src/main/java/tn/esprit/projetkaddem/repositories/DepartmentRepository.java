package tn.esprit.projetkaddem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projetkaddem.entities.Departement;

public interface DepartmentRepository extends JpaRepository<Departement ,Integer> {
}

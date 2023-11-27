package pe.edu.upao.martes.repositories.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upao.martes.models.Trainings;

@Repository
public interface TrainingsRepository extends JpaRepository<Trainings, Long> {
    // Puedes agregar consultas personalizadas si es necesario
}

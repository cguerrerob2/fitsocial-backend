package pe.edu.upao.martes.repositories.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upao.martes.models.Exercises;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercises, Long> {
    // Puedes agregar consultas personalizadas si es necesario
}

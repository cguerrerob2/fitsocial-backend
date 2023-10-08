package pe.edu.upao.martes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upao.martes.models.Exercises;
import pe.edu.upao.martes.repositories.ExerciseRepository;

import java.util.List;

@Service
public class ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

    public List<Exercises> listAllExercises() {
        return exerciseRepository.findAll();
    }

    public Exercises saveExercise(Exercises exercise) {
        return exerciseRepository.save(exercise);
    }
}

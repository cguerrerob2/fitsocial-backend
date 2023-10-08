package pe.edu.upao.martes.repositories;

import pe.edu.upao.martes.models.Exercises;

import java.util.ArrayList;

public interface IExerciseRepository {
    ArrayList<Exercises> list();

    Exercises save(Exercises exercise);
}


package pe.edu.upao.martes.repositories;

import pe.edu.upao.martes.models.Exercises;

import java.util.ArrayList;

public class ExerciseRepositoryArray implements IExerciseRepository {

    private static ArrayList<Exercises> exercisesList = new ArrayList<>();

    @Override
    public ArrayList<Exercises> list() {
        return exercisesList;
    }

    @Override
    public Exercises save(Exercises exercise) {
        exercisesList.add(exercise);
        return exercise;
    }
}

package pe.edu.upao.martes.repositories.interfaces;

import pe.edu.upao.martes.models.DataExercises;

import java.util.ArrayList;

public interface IDataExerciseRepository {
    ArrayList<DataExercises> list();

    DataExercises save(DataExercises exercise);
}

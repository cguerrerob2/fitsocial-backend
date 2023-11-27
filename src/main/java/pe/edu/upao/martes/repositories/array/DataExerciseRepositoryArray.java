package pe.edu.upao.martes.repositories.array;

import pe.edu.upao.martes.models.DataExercises;
import pe.edu.upao.martes.repositories.interfaces.IDataExerciseRepository;

import java.util.ArrayList;

public class DataExerciseRepositoryArray implements IDataExerciseRepository {

    private static ArrayList<DataExercises> dataExerciseList = new ArrayList<>();

    @Override
    public ArrayList<DataExercises> list() {
        return dataExerciseList;
    }

    @Override
    public DataExercises save(DataExercises dataExercise) {
        dataExerciseList.add(dataExercise);
        return dataExercise;
    }
}

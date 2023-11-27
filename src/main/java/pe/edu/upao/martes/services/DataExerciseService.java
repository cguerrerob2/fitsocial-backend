package pe.edu.upao.martes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upao.martes.models.DataExercises;
import pe.edu.upao.martes.repositories.interfaces.IDataExerciseRepository;
import pe.edu.upao.martes.repositories.repository.DataExerciseRepository;

import java.util.List;

@Service
public class DataExerciseService {

    @Autowired
    private DataExerciseRepository dataExerciseRepository;

    public List<DataExercises> listAllDataExercises() {
        return dataExerciseRepository.findAll();
    }

    public DataExercises saveDataExercise(DataExercises dataExercise) {
        return dataExerciseRepository.save(dataExercise);
    }
}

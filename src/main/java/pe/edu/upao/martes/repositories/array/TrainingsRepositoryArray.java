package pe.edu.upao.martes.repositories.array;

import pe.edu.upao.martes.models.Trainings;
import pe.edu.upao.martes.repositories.interfaces.ITrainingsRepository;

import java.util.ArrayList;
import java.util.List;

public class TrainingsRepositoryArray implements ITrainingsRepository {

    private static List<Trainings> trainingsList = new ArrayList<>();

    @Override
    public List<Trainings> list() {
        return trainingsList;
    }

    @Override
    public Trainings save(Trainings training) {
        trainingsList.add(training);
        return training;
    }
}

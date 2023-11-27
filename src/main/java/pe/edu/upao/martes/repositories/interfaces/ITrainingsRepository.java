package pe.edu.upao.martes.repositories.interfaces;

import pe.edu.upao.martes.models.Trainings;

import java.util.List;

public interface ITrainingsRepository {
    List<Trainings> list();

    Trainings save(Trainings exercise);
}


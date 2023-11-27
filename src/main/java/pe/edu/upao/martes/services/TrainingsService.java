package pe.edu.upao.martes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upao.martes.models.Trainings;
import pe.edu.upao.martes.repositories.repository.TrainingsRepository;

import java.util.List;

@Service
public class TrainingsService {

    private final TrainingsRepository trainingsRepository;

    @Autowired
    public TrainingsService(TrainingsRepository trainingsRepository) {
        this.trainingsRepository = trainingsRepository;
    }

    public List<Trainings> listAllTrainings() {
        return trainingsRepository.findAll();
    }

    public Trainings saveTraining(Trainings training) {
        return trainingsRepository.save(training);
    }
}

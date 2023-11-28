package pe.edu.upao.martes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upao.martes.models.Trainings;
import pe.edu.upao.martes.repositories.repository.TrainingsRepository;

import java.util.List;
import java.util.Optional;

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

    public void deleteTraining(Long trainingId) {
        // Check if the training exists
        Optional<Trainings> optionalTraining = trainingsRepository.findById(trainingId);
        if (optionalTraining.isPresent()) {
            // If the training exists, delete it
            trainingsRepository.deleteById(trainingId);
        } else {
            // If the training doesn't exist, you might want to throw an exception or handle it accordingly
            throw new IllegalArgumentException("Training with ID " + trainingId + " not found");
        }
    }
}

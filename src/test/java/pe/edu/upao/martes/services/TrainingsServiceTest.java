package pe.edu.upao.martes.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import pe.edu.upao.martes.models.Trainings;
import pe.edu.upao.martes.repositories.repository.TrainingsRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class TrainingsServiceTest {

    @InjectMocks
    private TrainingsService trainingsService;

    @Mock
    private TrainingsRepository trainingsRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testListAllTrainings() {
        // Datos de prueba
        Trainings training1 = new Trainings();

        Trainings training2 = new Trainings();

        List<Trainings> trainings = new ArrayList<>();
        trainings.add(training1);
        trainings.add(training2);

        // Configuración del comportamiento simulado del repositorio
        when(trainingsRepository.findAll()).thenReturn(trainings);

        // Llamar al método del servicio
        List<Trainings> result = trainingsService.listAllTrainings();

        // Verificar que el resultado es el esperado
        assertEquals(2, result.size());
        assertEquals(training1, result.get(0));
        assertEquals(training2, result.get(1));
    }

    @Test
    public void testSaveTraining() {
        // Datos de prueba
        Trainings training = new Trainings();

        // Configuración del comportamiento simulado del repositorio
        when(trainingsRepository.save(training)).thenReturn(training);

        // Llamar al método del servicio
        Trainings result = trainingsService.saveTraining(training);

        // Verificar que el resultado es el esperado
        assertEquals(training, result);
    }

    @Test
    public void testDeleteTraining() {
        // Datos de prueba
        Long trainingId = 1L;

        // Configuración del comportamiento simulado del repositorio
        when(trainingsRepository.findById(trainingId)).thenReturn(Optional.of(new Trainings()));

        // Llamar al método del servicio
        trainingsService.deleteTraining(trainingId);

        // Verificar que el método del repositorio se llamó con el ID esperado
        verify(trainingsRepository, times(1)).deleteById(trainingId);
    }
}

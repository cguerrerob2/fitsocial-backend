package pe.edu.upao.martes.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import pe.edu.upao.martes.models.DataExercises;
import pe.edu.upao.martes.repositories.repository.DataExerciseRepository;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class DataExerciseServiceTest {

    @InjectMocks
    private DataExerciseService dataExerciseService;

    @Mock
    private DataExerciseRepository dataExerciseRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testListAllDataExercises() {
        // Datos de prueba
        DataExercises dataExercise1 = new DataExercises();
        dataExercise1.setMuscleGp("Biceps");

        DataExercises dataExercise2 = new DataExercises();
        dataExercise2.setMuscleGp("Triceps");

        List<DataExercises> dataExercises = new ArrayList<>();
        dataExercises.add(dataExercise1);
        dataExercises.add(dataExercise2);

        // Configuración del comportamiento simulado del repositorio
        when(dataExerciseRepository.findAll()).thenReturn(dataExercises);

        // Llamar al método del servicio
        List<DataExercises> result = dataExerciseService.listAllDataExercises();

        // Verificar que el resultado es el esperado
        assertEquals(2, result.size());
        assertEquals(dataExercise1, result.get(0));
        assertEquals(dataExercise2, result.get(1));
    }

    @Test
    public void testSaveDataExercise() {
        // Datos de prueba
        DataExercises dataExercise = new DataExercises();
        dataExercise.setMuscleGp("Chest");

        // Configuración del comportamiento simulado del repositorio
        when(dataExerciseRepository.save(dataExercise)).thenReturn(dataExercise);

        // Llamar al método del servicio
        DataExercises result = dataExerciseService.saveDataExercise(dataExercise);

        // Verificar que el resultado es el esperado
        assertEquals(dataExercise, result);
    }
}

package pe.edu.upao.martes.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pe.edu.upao.martes.models.Exercises;
import pe.edu.upao.martes.repositories.repository.ExerciseRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ExerciseServiceTest {

    private ExerciseRepository exerciseRepository;
    private ExerciseService exerciseService;

    @BeforeEach
    public void setUp() {
        exerciseRepository = mock(ExerciseRepository.class);
        exerciseService = new ExerciseService();
    }

    @Test
    public void testListAllExercises() {
        // Datos de prueba
        Exercises exercise1 = new Exercises();
        exercise1.setTitle("Exercise 1");
        exercise1.setReps(10);
        exercise1.setExercises("Exercise details 1");

        Exercises exercise2 = new Exercises();
        exercise2.setTitle("Exercise 2");
        exercise2.setReps(15);
        exercise2.setExercises("Exercise details 2");

        when(exerciseRepository.findAll()).thenReturn(List.of(exercise1, exercise2));

        // Llamar al método del servicio
        List<Exercises> result = exerciseService.listAllExercises();

        // Verificar que el resultado es el esperado
        assertEquals(2, result.size());
        assertEquals(exercise1, result.get(0));
        assertEquals(exercise2, result.get(1));
    }

    @Test
    public void testSaveExercise() {
        // Datos de prueba
        Exercises exercise = new Exercises();
        exercise.setTitle("New Exercise");
        exercise.setReps(20);
        exercise.setExercises("New Exercise details");

        when(exerciseRepository.save(exercise)).thenReturn(exercise);

        // Llamar al método del servicio
        Exercises result = exerciseService.saveExercise(exercise);

        // Verificar que el resultado es el esperado
        assertEquals(exercise, result);
    }
}

package pe.edu.upao.martes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upao.martes.models.Exercises;
import pe.edu.upao.martes.services.ExerciseService;

import java.util.List;

@RestController
@RequestMapping("training")
@CrossOrigin(origins = "http://localhost:4200")
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    @GetMapping("/")
    public List<Exercises> listExercises() {
        return exerciseService.listAllExercises();
    }

    @PostMapping("/")
    public Exercises createExercise(@RequestBody Exercises exercise) {
        return exerciseService.saveExercise(exercise);
    }
}

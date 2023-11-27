package pe.edu.upao.martes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upao.martes.models.DataExercises;
import pe.edu.upao.martes.services.DataExerciseService;

import java.util.List;

@RestController
@RequestMapping("searchtraining")
@CrossOrigin(origins = "http://localhost:4200")
public class DataController {

    @Autowired
    private DataExerciseService dataExerciseService;

    @GetMapping("/")
    public List<DataExercises> listExercises() {
        return dataExerciseService.listAllDataExercises();
    }

    @PostMapping("/")
    public DataExercises createExercise(@RequestBody DataExercises exercise) {
        return dataExerciseService.saveDataExercise(exercise);
    }
}

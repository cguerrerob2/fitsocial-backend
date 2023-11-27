package pe.edu.upao.martes.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "trainings")
@SequenceGenerator(name = "training_seq", sequenceName = "training_seq", allocationSize = 1)
public class Trainings {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "training_seq")
    private Long id;

    @OneToMany
    private List<DataExercises> exercises;

    private String reps;
    private String weight;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<DataExercises> getExercises() {
        return exercises;
    }

    public void setExercises(List<DataExercises> exercises) {
        this.exercises = exercises;
    }
}

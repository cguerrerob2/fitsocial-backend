package pe.edu.upao.martes.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "data_exercises")
public class DataExercises {

    @Id
    private String Exercise_Name;  //

    private String Description_URL;
    private String Exercise_Image;
    private String Exercise_Image1;
    private String muscle_gp_details;
    private String muscle_gp;
    private String equipment_details;
    private String Equipment;
    private String Rating;
    @Column(name = "Description")
    private String Description;

    public void setMuscleGp(String muscleGp) {
        this.muscle_gp = muscleGp;
    }

    public String getMuscleGp() {
        return muscle_gp;
    }
}

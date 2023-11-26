package pe.edu.upao.martes.controllers.serializers;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExercisesSerializer {
    private String name;      // Cambia 'name' según la información que representa
    private Integer duration; // Cambia 'capacity' a un nombre que represente la duración o algún otro atributo

    // Agrega otros atributos según sea necesario para la serialización de ejercicio
}

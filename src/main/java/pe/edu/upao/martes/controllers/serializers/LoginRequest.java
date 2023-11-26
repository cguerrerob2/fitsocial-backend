package pe.edu.upao.martes.controllers.serializers;

import lombok.Data;

@Data
public class LoginRequest {
    private String username; // Cambia 'name' a 'username'
    private String password; // Cambia 'capacity' a 'password'

    // Agrega otros atributos según lo necesario para la solicitud de inicio de sesión
}
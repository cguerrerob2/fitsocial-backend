package pe.edu.upao.martes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upao.martes.models.Usuario;

import java.util.ArrayList;

@RestController
public class HomeController {

    static ArrayList<Usuario> usuarioList = new ArrayList<>();

    @GetMapping("/")
    public String home() {

        return "<html>Hola</html>";
    }

    @GetMapping("/users")
    public ArrayList<Usuario> listUsers() {
        return usuarioList;
    }

    @PostMapping("/")
    public String saveUser(@RequestBody Usuario usuario) {
        usuarioList.add(usuario);
        return "ok";
    }
}

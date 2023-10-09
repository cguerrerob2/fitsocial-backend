package pe.edu.upao.martes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upao.martes.models.Usuario;
import pe.edu.upao.martes.services.UsuarioService;

import java.util.List;

@RestController
@RequestMapping("login")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/")
    public List<Usuario> listUsuarios() {
        return usuarioService.listAllUsuarios();
    }

    @PostMapping("/")
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return usuarioService.saveUsuario(usuario);
    }
}

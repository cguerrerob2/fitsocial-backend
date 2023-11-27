package pe.edu.upao.martes.services;

import pe.edu.upao.martes.models.Usuario;
import pe.edu.upao.martes.repositories.repository.UsuarioRepository;
import pe.edu.upao.martes.services.UsuarioService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class UsuarioServiceTest {

    private UsuarioRepository usuarioRepository;
    private UsuarioService usuarioService;

    @BeforeEach
    public void setUp() {
        usuarioRepository = mock(UsuarioRepository.class);
        usuarioService = new UsuarioService(usuarioRepository);
    }

    @Test
    public void testListAllUsuarios() {
        // Datos de prueba
        Usuario usuario1 = new Usuario();
        usuario1.setEmail("user1@example.com");
        usuario1.setPassword("password1");

        Usuario usuario2 = new Usuario();
        usuario2.setEmail("user2@example.com");
        usuario2.setPassword("password2");

        when(usuarioRepository.findAll()).thenReturn(List.of(usuario1, usuario2));

        // Llamar al método del servicio
        List<Usuario> result = usuarioService.listAllUsuarios();

        // Verificar que el resultado es el esperado
        assertEquals(2, result.size());
        assertEquals(usuario1, result.get(0));
        assertEquals(usuario2, result.get(1));
    }

    @Test
    public void testSaveUsuario() {
        // Datos de prueba
        Usuario usuario = new Usuario();
        usuario.setEmail("user1@example.com");
        usuario.setPassword("password1");

        when(usuarioRepository.save(usuario)).thenReturn(usuario);

        // Llamar al método del servicio
        Usuario result = usuarioService.saveUsuario(usuario);

        // Verificar que el resultado es el esperado
        assertEquals(usuario, result);
    }
}

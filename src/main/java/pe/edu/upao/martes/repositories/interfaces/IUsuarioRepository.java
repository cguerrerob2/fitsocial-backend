package pe.edu.upao.martes.repositories.interfaces;

import pe.edu.upao.martes.models.Usuario;

import java.util.List;

public interface IUsuarioRepository {
    List<Usuario> list();

    Usuario save(Usuario usuario);
}

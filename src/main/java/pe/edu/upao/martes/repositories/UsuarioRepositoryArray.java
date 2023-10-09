package pe.edu.upao.martes.repositories;

import pe.edu.upao.martes.models.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositoryArray implements IUsuarioRepository {

    private static List<Usuario> usuariosList = new ArrayList<>();

    @Override
    public List<Usuario> list() {
        return usuariosList;
    }

    @Override
    public Usuario save(Usuario usuario) {
        usuariosList.add(usuario);
        return usuario;
    }
}

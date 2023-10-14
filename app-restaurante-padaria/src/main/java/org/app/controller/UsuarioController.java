package org.app.controller;

import org.app.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioController {

    private List<Usuario> bdUser = new ArrayList<>();

    public List<Usuario> getBdUser() {
        return bdUser;
    }

    public void setBdUser(List<Usuario> bdUser) {
        this.bdUser = bdUser;
    }

    public boolean novoUsuario(Usuario usuario) {

        if(usuario == null) {
            return false;
        }

        return bdUser.add(usuario);
    }

    public boolean editaUsuario(Usuario usuario) {
        if(usuario == null) {
            return false;
        }

        Usuario usuarioAntigo = new Usuario();

        usuarioAntigo.setNome(usuario.getNome());
        usuarioAntigo.setCnpj(usuario.getCnpj());
        usuarioAntigo.setCategoria(usuario.getCategoria());
        usuarioAntigo.setEndereco(usuario.getEndereco());

        return bdUser.add(usuarioAntigo);
    }

    public boolean deletaUsuario(Usuario usuario) {
        return bdUser.remove(usuario);
    }
}

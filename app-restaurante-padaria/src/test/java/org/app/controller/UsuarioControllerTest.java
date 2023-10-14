package org.app.controller;

import org.app.model.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

class UsuarioControllerTest {
    @InjectMocks
    UsuarioController usuarioController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testNovoUsuario() {
        usuarioController.setBdUser(new ArrayList<>());
        boolean result = usuarioController.novoUsuario(new Usuario());
        Assertions.assertTrue(result);
    }

    @Test
    void testNovoUsuarioSeNulo() {
        usuarioController.setBdUser(new ArrayList<>());
        boolean result = usuarioController.novoUsuario(null);
        Assertions.assertFalse(result);
    }

    @Test
    void testEditaUsuario() {
        usuarioController.setBdUser(new ArrayList<>());
        boolean result = usuarioController.editaUsuario(new Usuario());
        Assertions.assertTrue(result);
    }

    @Test
    void testEditaUsuarioSeNulo() {
        usuarioController.setBdUser(new ArrayList<>());
        boolean result = usuarioController.editaUsuario(null);
        Assertions.assertFalse(result);
    }

    @Test
    void testDeletaUsuario() {
        usuarioController.setBdUser(new ArrayList<>());
        Usuario user = new Usuario();
        usuarioController.getBdUser().add(user);
        boolean result = usuarioController.deletaUsuario(user);
        Assertions.assertTrue(result);
    }

    @Test
    void testDeletaUsuarioSeInexistente() {
        usuarioController.setBdUser(new ArrayList<>());
        Usuario user = new Usuario();
        usuarioController.getBdUser().add(user);
        boolean result = usuarioController.deletaUsuario(new Usuario());
        Assertions.assertFalse(result);
    }
}
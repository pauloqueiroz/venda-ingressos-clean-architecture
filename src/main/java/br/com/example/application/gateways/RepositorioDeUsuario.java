package br.com.example.application.gateways;

import br.com.example.domain.entities.usuario.Usuario;

import java.util.List;

public interface RepositorioDeUsuario{

    Usuario cadastrarUsuario(Usuario usuario);

    List<Usuario> listarTodos();
}

package br.com.example.application.usecases;

import br.com.example.application.gateways.RepositorioDeUsuario;
import br.com.example.domain.entities.usuario.Usuario;

public class CriacaoUsuario {

    private final RepositorioDeUsuario repositorio;

    public CriacaoUsuario(RepositorioDeUsuario repositorio) {
        this.repositorio = repositorio;
    }

    public Usuario cadastrarUsuario(Usuario usuario){
         return repositorio.cadastrarUsuario(usuario);
    }

}

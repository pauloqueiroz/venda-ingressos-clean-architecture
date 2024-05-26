package br.com.example.domain.entities.usuario;

import br.com.example.domain.Endereco;

import java.time.LocalDate;

public class Usuario {

    private String cpf;
    private String nome;
    private LocalDate nascimento;
    private String email;
    private Endereco endereco;

    public Usuario(String nome, LocalDate nascimento, String email, String cpf) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.email = email;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}

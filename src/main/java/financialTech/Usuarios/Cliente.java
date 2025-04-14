package Usuarios;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;

@Entity
public class Cliente {

    @Nonnull
    public String nomeCompleto;
    @Nonnull
    public String email;
    @Nonnull
    public String senha;
    @Nonnull
    public Integer cpf;

    public Cliente(String nomeCompleto, String email, String senha, Integer cpf) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }
}

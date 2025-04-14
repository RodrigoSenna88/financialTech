package Usuarios;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;

@Entity
public class Lojista {
    @Nonnull
    public String nomeCompleto;
    @Nonnull
    public String email;
    @Nonnull
    public String senha;
    @Nonnull
    public Integer cnpj;

    public Lojista(String nomeCompleto, String email, String senha, Integer cnpj) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.senha = senha;
        this.cnpj = cnpj;
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

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }
}

package br.senac.rn.lojarapida.model;

import java.io.Serializable;

public class Login implements Serializable {

    private final String email;
    private final String senha;

    public Login(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
    
}

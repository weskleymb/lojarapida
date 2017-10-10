package br.senac.rn.lojarapida.controller;

import br.senac.rn.lojarapida.model.Login;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@RequestScoped
@ManagedBean(name = "loginBean")
public class LoginBean {

    private Login login;
    private String email;
    private String senha;

    public String entrar() {
        FacesContext context = FacesContext.getCurrentInstance();
        if (email.equals("usuario") && senha.equals("123")) {
            login = new Login(email, senha);
            HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
            session.setAttribute("login", login);
//            session.setAttribute("usuarioLogado", true);
            return "restrito/venda?faces-redirect=true";
        } else {
            
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_FATAL, "Info", "Não Entrou!!!");
            context.addMessage(null, message);
        }
        return null;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
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

}

package br.senac.rn.lojarapida.controller;

import br.senac.rn.lojarapida.dao.ClienteDAO;
import br.senac.rn.lojarapida.model.Cliente;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "vendaBean")
public class VendaBean {

    private Cliente cliente;

    public List<Cliente> getClientesPorCpf(String cpf) {
        ClienteDAO dao = new ClienteDAO();
        return dao.buscarPorCpf(cpf);
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
}

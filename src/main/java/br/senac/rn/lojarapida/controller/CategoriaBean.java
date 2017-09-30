package br.senac.rn.lojarapida.controller;

import br.senac.rn.lojarapida.dao.CategoriaDAO;
import br.senac.rn.lojarapida.model.Categoria;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "categoriaBean")
public class CategoriaBean {

    private Categoria categoria = new Categoria();

    public void salvar() {
        CategoriaDAO dao = new CategoriaDAO();
        dao.insert(this.categoria);
        this.categoria = new Categoria();
    }
    
    public void editar(Categoria categoria) {}
    
    public void remover(Categoria categoria) {}
    
    public List<Categoria> getCategorias() {
        CategoriaDAO dao = new CategoriaDAO();
        return dao.selectAll();
    }
    
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
}

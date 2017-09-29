package br.senac.rn.lojarapida.principal;

import br.senac.rn.lojarapida.dao.CategoriaDAO;
import br.senac.rn.lojarapida.model.Categoria;

public class Principal {
    
    public static void main(String[] args) {
        
        new CategoriaDAO().insert(new Categoria(0, "Calçados", "Setor de Calçados"));

//        System.out.println(new CategoriaDAO().selectAll());

        System.exit(0);
        
    }
    
}

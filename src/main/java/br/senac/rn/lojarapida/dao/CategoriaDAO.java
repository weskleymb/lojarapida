package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.Categoria;
import br.senac.rn.lojarapida.util.GenericDAO;

public class CategoriaDAO extends GenericDAO<Categoria> {

    @Override
    public Class<Categoria> getClassType() {
        return Categoria.class;
    }

}

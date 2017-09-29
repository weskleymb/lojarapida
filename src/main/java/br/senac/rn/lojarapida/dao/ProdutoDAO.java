package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.Produto;
import br.senac.rn.lojarapida.util.GenericDAO;

public class ProdutoDAO extends GenericDAO<Produto> {

    @Override
    public Class<Produto> getClassType() {
        return Produto.class;
    }

}

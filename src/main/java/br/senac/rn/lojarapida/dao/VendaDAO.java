package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.Venda;
import br.senac.rn.lojarapida.util.GenericDAO;

public class VendaDAO extends GenericDAO<Venda> {

    @Override
    public Class<Venda> getClassType() {
        return Venda.class;
    }
    
}

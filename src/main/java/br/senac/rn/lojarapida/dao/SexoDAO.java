package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.Sexo;
import br.senac.rn.lojarapida.util.GenericDAO;

public class SexoDAO extends GenericDAO<Sexo> {

    @Override
    public Class<Sexo> getClassType() {
        return Sexo.class;
    }
    
}

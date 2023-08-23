package com.persistencias;
import com.classes.DTO.Contato;

import java.util.List;

public interface Persistencia {

    public boolean salvar(Contato contato);

    public List<Contato> lerContatos();
}

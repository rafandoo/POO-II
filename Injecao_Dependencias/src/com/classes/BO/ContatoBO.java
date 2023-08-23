package com.classes.BO;

import com.classes.DTO.Contato;
import com.persistencias.Controle;
import com.persistencias.Persistencia;

import java.util.List;

public class ContatoBO {

    public boolean salvar(Contato contato, Persistencia persistencia) {
        Controle controlador = new Controle(persistencia);
        return controlador.salvar(contato);
    }

    public List<Contato> lerContatos(Persistencia persistencia) {
        Controle controlador = new Controle(persistencia);
        return controlador.lerContatos();
    }
}

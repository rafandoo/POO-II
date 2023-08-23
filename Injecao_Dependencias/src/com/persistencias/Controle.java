package com.persistencias;

import com.classes.DTO.Contato;

import java.util.List;

public class Controle {
    protected Persistencia persistencia;

    public Controle(Persistencia persistencia) {
        this.persistencia = persistencia;
    }

    public boolean salvar(Contato contato) {
        return this.persistencia.salvar(contato);
    }

    public List<Contato> lerContatos() {
        return this.persistencia.lerContatos();
    }
}

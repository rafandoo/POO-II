package com.persistencias;

import com.classes.DTO.Contato;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaXML implements Persistencia {

    private final static String ARQUIVO = "data/contatos.xml";

    public boolean salvar(Contato contato) {
        try {
            Document documento;

            if (new File(ARQUIVO).exists()) {
                documento = lerDocumento();
            } else {
                Element root = new Element("contatos");
                documento = new Document(root);
            }

            Element contatosElement = documento.getRootElement();

            Element contatoElem = new Element("contato");
            contatoElem.setAttribute("id", String.valueOf(contato.getId()));

            contatoElem.addContent(criarElemento("nome", contato.getNome()));
            contatoElem.addContent(criarElemento("data_nascimento", contato.getDataNascimento()));
            contatoElem.addContent(criarElemento("telefone", contato.getTelefone()));
            contatoElem.addContent(criarElemento("email", contato.getEmail()));

            contatosElement.addContent(contatoElem);

            XMLOutputter xout = new XMLOutputter();
            xout.setFormat(Format.getPrettyFormat());

            try (BufferedWriter arquivo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ARQUIVO), "UTF-8"))) {
                xout.output(documento, arquivo);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private Document lerDocumento() throws Exception {
        SAXBuilder builder = new SAXBuilder();
        return builder.build(new File(ARQUIVO));
    }

    private Element criarElemento(String nome, String conteudo) {
        Element elemento = new Element(nome);
        elemento.setText(conteudo);
        return elemento;
    }

    public List<Contato> lerContatos() {
        List<Contato> contatos = new ArrayList<>();
        try {
            Document documento = lerDocumento();

            Element contatosElement = documento.getRootElement();
            List<Element> contatoElements = contatosElement.getChildren("contato");

            for (Element contatoElem : contatoElements) {
                int id = Integer.parseInt(contatoElem.getAttributeValue("id"));
                String nome = contatoElem.getChildText("nome");
                String dataNascimento = contatoElem.getChildText("data_nascimento");
                String telefone = contatoElem.getChildText("telefone");
                String email = contatoElem.getChildText("email");

                Contato contato = new Contato(id, nome, dataNascimento, telefone, email);
                contatos.add(contato);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contatos;
    }
}

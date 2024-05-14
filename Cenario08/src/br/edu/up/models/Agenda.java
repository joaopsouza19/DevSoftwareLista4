package br.edu.up.models;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda(){
        contatos = new ArrayList<>();
    }

    public void adicionar(Contato contato){
        contatos.add(contato);
    }

    public Contato getContato(int codigo){
        for (Contato contato : contatos){
            if (contato.getCodigo() == codigo){
                return contato;
            }
        }
        return null;
    }

    public void excluirContato(int codigo){
        contatos.removeIf(contato -> contato.getCodigo() == codigo);
    }

    public String listarContatos(){
        StringBuilder lista = new StringBuilder();
        for (Contato contato : contatos){
            lista.append(contato).append("\n");
        }
        return lista.toString();
    }
}

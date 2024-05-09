package br.edu.up;

import br.edu.up.controllers.ControleEstacionamento;
import br.edu.up.view.UsuarioInterface;

public class Programa {
    public static void main(String[] args) {
        ControleEstacionamento controller = new ControleEstacionamento();
        UsuarioInterface usuarioInterface = new UsuarioInterface(controller);
        usuarioInterface.exibirMenu();
    }
}

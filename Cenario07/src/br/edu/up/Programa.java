package br.edu.up;

import br.edu.up.view.IUsuario;
import br.edu.up.controllers.Controlador;

public class Programa {
    public static void main(String[] args) {
        IUsuario usuario = new IUsuario();
        Controlador controlador = new Controlador(usuario);
        controlador.iniciar();
    }
}
package br.edu.up;

import br.edu.up.view.*;
import br.edu.up.controllers.*;

public class Program {
    public static void main(String[] args){
        IUsuario view = new IUsuario();
        Controlador controlador = new Controlador(view);
        controlador.iniciar();
    }
}

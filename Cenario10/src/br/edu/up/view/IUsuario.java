package br.edu.up.view;
import br.edu.up.Prompt;

public class IUsuario {
    public void mostrarMenu(){
        Prompt.imprimir("Menu:");
        Prompt.imprimir("1. Incluir seguro");
        Prompt.imprimir("2. Localizar seguro");
        Prompt.imprimir("3. Excluir seguro");
        Prompt.imprimir("4. Excluir todos os seguros");
        Prompt.imprimir("5. Listar todos os seguros");
        Prompt.imprimir("6. Ver quantidade de seguros");
        Prompt.imprimir("7. Sair");
        Prompt.imprimir("Escolha uma opção: ");
    }

    public void mostrarMensagem(String mensagem){
        Prompt.imprimir(mensagem);
    }
}
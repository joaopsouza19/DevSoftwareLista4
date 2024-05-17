package br.edu.up.view;

public class IUsuario {
    public void mostrarMenu() {
        System.out.println("Menu:");
        System.out.println("1. Incluir seguro");
        System.out.println("2. Localizar seguro");
        System.out.println("3. Excluir seguro");
        System.out.println("4. Excluir todos os seguros");
        System.out.println("5. Listar todos os seguros");
        System.out.println("6. Ver quantidade de seguros");
        System.out.println("7. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
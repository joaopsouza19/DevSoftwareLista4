package br.edu.up.view;

import br.edu.up.models.*;
import br.edu.up.Prompt;

public class IUsuario {
    public int mostrarMenu() {
        Prompt.imprimir("Menu:");
        Prompt.imprimir("1. Incluir cliente pessoa");
        Prompt.imprimir("2. Incluir cliente empresa");
        Prompt.imprimir("3. Mostrar dados cliente pessoa");
        Prompt.imprimir("4. Mostrar dados cliente empresa");
        Prompt.imprimir("5. Emprestar para cliente pessoa");
        Prompt.imprimir("6. Emprestar para cliente empresa");
        Prompt.imprimir("7. Devoluçao de cliente pessoa");
        Prompt.imprimir("8. Devoluçao de cliente empresa");
        Prompt.imprimir("9. Sair");
        return Prompt.lerInteiro("Escolha uma opçao: ");
    }

    public void mostrarMensagem(String mensagem) {
        Prompt.imprimir(mensagem);
    }

    public ClientePessoa capturarDadosClientePessoa() {
        ClientePessoa cliente = new ClientePessoa();
        cliente.setNome(Prompt.lerLinha("Nome: "));
        cliente.setTelefone(Prompt.lerLinha("Telefone: "));
        cliente.setEmail(Prompt.lerLinha("Email: "));
        cliente.setCPF(Prompt.lerLinha("CPF: "));
        cliente.setPeso(Prompt.lerDecimal("Peso: "));
        cliente.setAltura(Prompt.lerDecimal("Altura: "));
        return cliente;
    }

    public ClienteEmpresa capturarDadosClienteEmpresa() {
        ClienteEmpresa cliente = new ClienteEmpresa();
        cliente.setNome(Prompt.lerLinha("Nome: "));
        cliente.setTelefone(Prompt.lerLinha("Telefone: "));
        cliente.setEmail(Prompt.lerLinha("Email: "));
        cliente.setCNPJ(Prompt.lerLinha("CNPJ: "));
        cliente.setInscEstadual(Prompt.lerLinha("Inscriçao Estadual: "));
        cliente.setAnoFundacao(Prompt.lerInteiro("Ano de Fundaçao: "));
        return cliente;
    }

    public double capturarValor(String operacao) {
        return Prompt.lerDecimal("Valor a " + operacao + ": ");
    }
}
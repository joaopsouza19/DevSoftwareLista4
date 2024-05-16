package br.edu.up.models;

public class ClientePessoa extends Cliente {
    private String CPF;
    private double Peso;
    private double Altura;

    public ClientePessoa(){
        super(15000.0);
    }

    @Override
    public double emprestar(double valor){
        if (getVlrEmprestado() + valor <= getVlrMaxCredito()){
            setVlrEmprestado(getVlrEmprestado() + valor);
            return getVlrEmprestado();
        } else {
            return -1; 
        }
    }

    @Override
    public double devolver(double valor){
        if (getVlrEmprestado() - valor >= 0){
            setVlrEmprestado(getVlrEmprestado() - valor);
            return getVlrEmprestado();
        } else {
            return -1; 
        }
    }

    public String getCPF(){
        return CPF;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public double getPeso(){
        return Peso;
    }

    public void setPeso(double Peso){
        this.Peso = Peso;
    }

    public double getAltura(){
        return Altura;
    }

    public void setAltura(double Altura){
        this.Altura = Altura;
    }

    @Override
    public String toString(){
        return "ClientePessoa [nome = " + getNome() + ", telefone = " + getTelefone() + ", email = " + getEmail() + ", CPF = " + CPF + ", Peso = " + Peso + ", Altura = " + Altura + ", saldo = " + getSaldo() + "]";
    }
}
package br.edu.up.models;

public abstract class Cliente {
    private String Nome;
    private String Telefone;
    private String Email;
    private double VlrMaxCredito;
    private double VlrEmprestado;

    public double getSaldo() {
        return VlrEmprestado;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public double getVlrMaxCredito() {
        return VlrMaxCredito;
    }

    public void setVlrMaxCredito(double vlrMaxCredito) {
        VlrMaxCredito = vlrMaxCredito;
    }

    public double getVlrEmprestado() {
        return VlrEmprestado;
    }

    public void setVlrEmprestado(double vlrEmprestado) {
        VlrEmprestado = vlrEmprestado;
    }

}
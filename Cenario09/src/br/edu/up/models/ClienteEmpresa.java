package br.edu.up.models;

public class ClienteEmpresa extends Cliente {
    private String CNPJ;
    private String InscEstadual;
    private int AnoFundacao;

    public ClienteEmpresa(){
        super(57000.0);
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

    public String getCNPJ(){
        return CNPJ;
    }

    public void setCNPJ(String CNPJ){
        this.CNPJ = CNPJ;
    }

    public String getInscEstadual(){
        return InscEstadual;
    }

    public void setInscEstadual(String InscEstadual){
        this.InscEstadual = InscEstadual;
    }

    public int getAnoFundacao(){
        return AnoFundacao;
    }

    public void setAnoFundacao(int AnoFundacao){
        this.AnoFundacao = AnoFundacao;
    }

    @Override
    public String toString(){
        return "ClienteEmpresa [nome = " + getNome() + ", telefone = " + getTelefone() + ", email = " + getEmail() + ", CNPJ = " + CNPJ + ", InscEstadual = " + InscEstadual + ", AnoFundacao = " + AnoFundacao + ", saldo = " + getSaldo() + "]";
    }
}
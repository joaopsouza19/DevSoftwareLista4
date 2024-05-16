package br.edu.up.models;

public class Endereco {
    private String Rua;
    private String Numero;
    private String Bairro;
    private String CEP;
    private String Cidade;

    public String getRua(){
        return Rua;
    }

    public void setRua(String rua){
        Rua = rua;
    }

    public String getNumero(){
        return Numero;
    }

    public void setNumero(String numero){
        Numero = numero;
    }

    public String getBairro(){
        return Bairro;
    }

    public void setBairro(String bairro){
        Bairro = bairro;
    }

    public String getCEP(){
        return CEP;
    }

    public void setCEP(String cEP){
        CEP = cEP;
    }

    public String getCidade(){
        return Cidade;
    }

    public void setCidade(String cidade){
        Cidade = cidade;
    }

    @Override
    public String toString(){
        return "Endereco [Rua=" + Rua + ", Numero=" + Numero + ", Bairro=" + Bairro + ", CEP=" + CEP + ", Cidade="
                + Cidade + "]";
    }

}
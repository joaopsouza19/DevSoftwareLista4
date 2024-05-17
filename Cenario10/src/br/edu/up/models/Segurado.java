package br.edu.up.models;

public class Segurado {
    private String nome;
    private String RG;
    private String CPF;
    private Sexo sexo;
    private String telefone;
    private String endereco;
    private String CEP;
    private String cidade;

    public enum Sexo { MASCULINO, FEMININO, OUTRO }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getRG(){
        return RG;
    }

    public void setRG(String RG){
        this.RG = RG;
    }

    public String getCPF(){
        return CPF;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public Sexo getSexo(){
        return sexo;
    }

    public void setSexo(Sexo sexo){
        this.sexo = sexo;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getCEP(){
        return CEP;
    }

    public void setCEP(String CEP){
        this.CEP = CEP;
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    @Override
    public String toString(){
        return "Segurado [nome=" + nome + ", RG=" + RG + ", CPF=" + CPF + ", sexo=" + sexo + ", telefone=" + telefone + ", endereco=" + endereco + ", CEP=" + CEP + ", cidade=" + cidade + "]";
    }
}

package br.edu.up.models;

public class SeguroVida extends Seguro {
    private boolean cobreDoenca;
    private boolean cobreAcidente;

    public boolean isCobreDoenca(){
        return cobreDoenca;
    }

    public void setCobreDoenca(boolean cobreDoenca){
        this.cobreDoenca = cobreDoenca;
    }

    public boolean isCobreAcidente(){
        return cobreAcidente;
    }

    public void setCobreAcidente(boolean cobreAcidente){
        this.cobreAcidente = cobreAcidente;
    }

    @Override
    public String getDados(){
        return "SeguroVida [apolice=" + getApolice() + ", segurado=" + getSegurado() + ", vlrApolice=" + getVlrApolice() + ", dtaInicio=" + getDtaInicio() + ", dtaFim=" + getDtaFim() + ", cobreDoenca=" + cobreDoenca + ", cobreAcidente=" + cobreAcidente + "]";
    }
}


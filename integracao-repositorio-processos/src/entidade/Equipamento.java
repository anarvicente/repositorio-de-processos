package entidade;

import java.io.Serializable;

public class Equipamento extends TipoRecurso implements Serializable {

    private String codigoTipo;
    private String descricao;

    Equipamento() {
    }

    public void setCodigoTipo(String i) {
        codigoTipo = i;
    }

    public String getCodigoTipo() {
        return codigoTipo;
    }

    public void setDescricao(String s) {
        descricao = s;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public String toString()
    {
        return "\nRecurso Equipamento " + super.toString() + "\nCodigo: " + codigoTipo+ "\nDescricao: " + descricao; 
    }

}
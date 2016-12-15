package entidade;
import java.io.Serializable;

public class Humano extends TipoRecurso implements Serializable {

    private int qualificacao;
    private String papel;

    public Humano() {
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String s) {
        papel = s;
    }

    public int getQualificacao() {
        return qualificacao;
    }

    public void setQualificacao(int i) {
        qualificacao = i;
    }
    
    public String toString()
    {
        return "\nRecurso Humano " + super.toString() + "\nQualificação: " + qualificacao + "\nPapel: " + papel; 
    }
}

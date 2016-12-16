package Instancia;

import Modelo.*;
import Serializador.IOSerial;
import fronteira.Saida;
import java.io.Serializable;

public class RecursosDisponiveis extends IOSerial implements Serializable {
    private Integer id;
    private String nome;
    private TipoRecurso tipoRecurso;
    private String descricao;
    private boolean disponivel;

    public RecursosDisponiveis() { }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoRecurso getTipoRecurso() {
        return this.tipoRecurso;
    }

    public void setTipoRecurso(TipoRecurso tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean getDisponivel() {
        return this.disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public void print() {
        Saida.print(getId() + "\t" + getNome() + "\t");
        Saida.print((this.tipoRecurso instanceof Humano) ? "Humano\t" : "Equipamento");
        Saida.println("\t" + getDescricao());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RecursosDisponiveis other = (RecursosDisponiveis) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
}

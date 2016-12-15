package Instancia;

import Modelo.*;

public class RecursosDisponiveis {
    private int id;
    private TipoRecurso tr;
    private String descricao;

    public RecursosDisponiveis() { }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoRecurso getTr() {
        return this.tr;
    }

    public void setTr(TipoRecurso tr) {
        this.tr = tr;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

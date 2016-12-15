package Instancia;

import java.util.ArrayList;

import Serializador.*;
import java.io.*;

public class Instancia extends IOSerial implements Serializable {
    private Integer id;
    private String descricao;
    private ArrayList<Recurso> alocRecursos;
    
    public Instancia() { }

    /**
     * @return the id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return this.descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the alocRecursos
     */
    public ArrayList<Recurso> getAlocRecursos() {
        return this.alocRecursos;
    }

    /**
     * @param recurso the recurso to set
     */
    public void setAlocRecursos(Recurso recurso) {
        this.alocRecursos.add(recurso);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.id;
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
        if (!(obj instanceof Instancia)) {
            return false;
        }
        final Instancia other = (Instancia) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}

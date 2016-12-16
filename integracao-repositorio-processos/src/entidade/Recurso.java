package entidade;

import java.io.*;

public class Recurso extends IOSerial implements Serializable {
    private Integer id;
    private TipoRecurso tipoRecurso;
    private String nome;
    private String descricao;
    private boolean disponivel;

    public boolean isDisponibilidade() {
        return disponivel;
    }

    public void setDisponibilidade(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Recurso() { }

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
     * @return the nome
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
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
     * @return the tipoRecurso
     */
    public TipoRecurso getTipoRecurso() {
        return this.tipoRecurso;
    }

    /**
     * @param tipoRecurso the tipoRecurso to set
     */
    public void setTipoRecurso(TipoRecurso tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    public boolean getDisponivel() {
        return this.disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public void print() {
        Saida.print(getId() + "\t" + getNome() + (getNome().length() < 10 ? "\t\t" : "\t"));
        Saida.print((this.tipoRecurso instanceof Humano) ? "Humano\t" : "Equipamento");
        Saida.println("\t" + getDisponivel() + "\t\t" + getDescricao());
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.id;
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
        if (!(obj instanceof Recurso)) {
            return false;
        }
        final Recurso other = (Recurso) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}

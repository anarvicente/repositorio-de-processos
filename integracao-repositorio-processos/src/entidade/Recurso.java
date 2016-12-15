package entidade;

import java.io.*;



public class Recurso extends IOSerial{
    private Integer id;
    private TipoRecurso tipo;
    private String nome;
    private String descricao;
    private boolean disponibilidade;

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
    public Recurso(TipoRecurso tipo, String nome, String descricao){
        this.id = null;
        this.tipo = tipo;
        this.nome = nome;
        this.descricao = descricao;
        this.disponibilidade = true;
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
     * @return the tipo
     */
    public TipoRecurso getTipo() {
        return this.tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoRecurso tipo) {
        this.tipo = tipo;
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
    
    public void imprimirRecurso(){
        System.out.println("\nNome: " +
                "Tipo de Recurso: " + getTipo().getId() + "\nNome: " +getNome() + "\nDescrição: " + getDescricao());
    }
}

package entidade;

import java.util.ArrayList;

import java.io.*;

public class Instancia extends IOSerial implements Serializable {
    private Integer id;
    private String nome;
    private String descricao;
    private ArrayList<Integer> recursos;
    private Integer tabelaExecucao;
    private EntryFile arquivo;
    
    public Instancia() { super(); }
    /**
     * @return the 
     */
    public EntryFile getArquivo() {
        return this.arquivo;
    }

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
     * @return the alocRecursos
     */
    public ArrayList<Integer> getRecursos() {
        return this.recursos;
    }

    /**
     * @param recurso the recurso to set
     */
    public void setAlocRecursos(int idRecurso) {
        this.recursos.add(idRecurso);
    }

    /**
     * @return the alocRecursos
     */
    public int getTabelaExecucao() {
        return this.tabelaExecucao;
    }

    /**
     * @param tabelaExecucao  the tabelaExecucao to set
     */
    public void setTabelaExecucao(int tabelaExecucao) {
        this.tabelaExecucao = tabelaExecucao;
    }
    
    public void print() {
        Saida.println(getId() + "\t" + getNome() + "\t" + getDescricao());
    }

    public static byte[] serialize(Recurso recurso) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(recurso);
        oos.flush();

        return baos.toByteArray();
    }

    public static Recurso deserialize(byte[] byteArray) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(byteArray));
        Recurso recurso = (Recurso) ois.readObject();

        return recurso;
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

package Instancia;

import java.io.*;
import Modelo.*;
import Serializador.*;

public class Recurso extends IOSerial implements Serializable {
    private Integer id;
    private TipoRecurso tipo;
    private String nome;
    private String descricao;
    private EntryFile arq;

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

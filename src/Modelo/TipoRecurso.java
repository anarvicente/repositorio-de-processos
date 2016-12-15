package Modelo;

import Serializador.*;
import java.io.*;


public abstract class TipoRecurso extends IOSerial implements Serializable{
    private int id;

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}


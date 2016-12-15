package Instancia;

import Modelo.*;
import java.util.UUID;

public class ItemExecucao {
    private UUID id;
    private ObjetodeFluxo item;
    private Boolean terminado;

    public ItemExecucao(ObjetodeFluxo item, Boolean terminado){
        this.id = UUID.randomUUID();
        this.item = item;
        this.terminado = terminado;
    }
    
    public UUID getId(){
        return this.id;
    }
    
    public ObjetodeFluxo getItem(){
        return this.item;
    }

    public void setItem(ObjetodeFluxo item){
        this.item = item;
    }

    public Boolean getTerminado(){
        return this.terminado;
    }

    public void setTerminado(Boolean terminado){
        this.terminado = terminado;
    }	
}


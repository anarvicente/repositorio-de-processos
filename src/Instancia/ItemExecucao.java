package Instancia;

import Modelo.*;

public class ItemExecucao {
	private ObjetodeFluxo item;
	private Boolean terminado;
	
	public ItemExecucao(ObjetodeFluxo item, Boolean terminado){
		this.item = item;
		this.terminado = terminado;
	}
	public ObjetodeFluxo getItem(){
		return item;
	}
	
	public void setItem(ObjetodeFluxo item){
		this.item = item;
	}
	
	public Boolean getTerminado(){
		return terminado;
	}
	
	public void setTerminado(Boolean terminado){
		this.terminado = terminado;
	}
	
}


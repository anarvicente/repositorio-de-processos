package entidade;

public class ItemExecucao {
	private ObjetoFluxo item;
	private Boolean terminado;
	
	public ItemExecucao(ObjetoFluxo item, Boolean terminado){
		this.item = item;
		this.terminado = terminado;
	}
	public ObjetoFluxo getItem(){
		return item;
	}
	
	public void setItem(ObjetoFluxo item){
		this.item = item;
	}
	
	public Boolean getTerminado(){
		return terminado;
	}
	
	public void setTerminado(Boolean terminado){
		this.terminado = terminado;
	}
	
}


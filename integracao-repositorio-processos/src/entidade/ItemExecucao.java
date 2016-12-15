package entidade;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.Serializable;

public class ItemExecucao extends IOSerial implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private ObjetodeFluxo item;
	private Boolean terminado;
	private Date inicio;
	private Date termino;

	
	public ItemExecucao(ObjetodeFluxo item, Boolean terminado){
		this.item = item;
		this.terminado = terminado;
	}


	public ObjetodeFluxo getItem() {
		return item;
	}


	public void setItem(ObjetodeFluxo item) {
		this.item = item;
	}


	public Boolean isTerminado() {
		return terminado;
	}


	public void setTerminado(Boolean terminado) {
		this.terminado = terminado;
	}


	public String getInicio() {
		return dateFormat.format(inicio);
	}


	public void setInicio() {
		this.inicio = new Date();
                
	}


	public String getTermino() {
		return dateFormat.format(termino);
	}


	public void setTermino() {
		this.termino = new Date();
	}
	
	
}

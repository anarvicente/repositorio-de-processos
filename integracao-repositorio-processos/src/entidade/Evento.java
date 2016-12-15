package entidade;

import java.io.Serializable;

public class Evento extends ObjetodeFluxo implements Serializable{
	private boolean lancamento;

	public boolean getLancamento() {
		return lancamento;
	}

	public void setLancamento(boolean lancamento) {
		this.lancamento = lancamento;
	}
        
        public String toString()
        {
            return super.toString() + "\nLancamento: " + lancamento; 
        }


}

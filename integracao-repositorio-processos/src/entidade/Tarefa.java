package entidade;

import java.io.Serializable;

public abstract class Tarefa extends ObjetodeFluxo implements Serializable {
	private int DuracaoEstimativa;
        private TipoRecurso recurso;

	public int getDE() {
		return DuracaoEstimativa;
	}

	public void setDE(int duracaoEstimativa) {
		DuracaoEstimativa = duracaoEstimativa;
	}
        
        public void setTR(TipoRecurso r)
        {
            recurso = r;
        }
        
        public TipoRecurso getTR()
        {
            return recurso;
        }
        
        public String toString()
        {
            return super.toString() + "\nDuração: " + DuracaoEstimativa + recurso.toString(); 
        }

}
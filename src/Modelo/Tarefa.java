package Modelo;

public abstract class Tarefa extends ObjetodeFluxo{
	private int DuracaoEstimativa;

	public int getDE() {
		return DuracaoEstimativa;
	}

	public void setDE(int duracaoEstimativa) {
		DuracaoEstimativa = duracaoEstimativa;
	}

}

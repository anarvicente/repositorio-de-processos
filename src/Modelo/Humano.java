package Modelo;

import java.io.Serializable;

public class Humano extends TipoRecurso implements Serializable{

	private int qualificacao;
	
	public int getQualificacao() {
		return qualificacao;
	}
	
	public void setQualificacao(int i) {
		qualificacao = i;
	}
	
}

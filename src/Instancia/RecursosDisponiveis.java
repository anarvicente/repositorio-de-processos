package Instancia;

import Modelo.*;

public class RecursosDisponiveis {
	private int id;
	private TipoRecurso tr;
	private String descricao;
	
	public RecursosDisponiveis(TipoRecurso tr, String descricao) {
		this.id = 2;
		this.setTr(tr);
		this.setDescricao(descricao);
	}

	public int getId() {
		return this.id;
	}

	public TipoRecurso getTr() {
		return this.tr;
	}

	public void setTr(TipoRecurso tr) {
		this.tr = tr;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}

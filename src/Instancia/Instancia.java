package Instancia;

import java.util.ArrayList;

import Modelo.*;

public class Instancia {
    private int id;
    private String descricao;
    private ArrayList<Recurso> alocRecursos;

	public Instancia(String descricao, ArrayList<Recurso> alocRecursos) {
        this.id = 2;
        this.setDescricao(descricao);
        this.setAlocRecursos(alocRecursos);
    }

	/**
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return this.descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the alocRecursos
	 */
	public ArrayList<Recurso> getAlocRecursos() {
		return this.alocRecursos;
	}

	/**
	 * @param alocRecursos the alocRecursos to set
	 */
	public void setAlocRecursos(ArrayList<Recurso> alocRecursos) {
		this.alocRecursos = alocRecursos;
	}
}

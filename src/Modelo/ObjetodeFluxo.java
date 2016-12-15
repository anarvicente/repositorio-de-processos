package Modelo;

public abstract class ObjetodeFluxo {
	private int id;
	private String nome;
	private int descricao;
	
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDescricao() {
		return descricao;
	}
	public void setDescricao(int descricao) {
		this.descricao = descricao;
	}
	
}

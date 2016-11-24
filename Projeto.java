package entidade;

import java.util.Date;


import java.util.ArrayList;

public class Projeto {
	private String nome;
	private String descricao;
	private Date dataCriacao;
	private Boolean status;
	private int id;
	private ArrayList<Usuario> usuarios;
	private ArrayList<Modelo> modelos;
	private ArrayList<Instancia> instancias;
	
	public void criarProjeto(String nome, String descricao, Boolean status, int id){
		this.nome = nome;
		this.descricao = descricao;
		this.status = status;
		this.id = id;
		dataCriacao = new Date();
		usuarios = new ArrayList<>();
		modelos = new ArrayList<>();
		instancias = new ArrayList<>();
		
	}
	public String getDescricao(){
		return this.descricao;
	}
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public Date getDataCriacao(){
		return this.dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao){
		this.dataCriacao = dataCriacao;
	}
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	
	public Boolean getStatus(){
		return this.status;
	}
	
	public void setStatus(Boolean status){
		this.status = status;
	}
	
	public void addUsuario(Usuario usuario){
		usuarios.add(usuario);
	}
	
	public void addModelo(Modelo modelo){
		modelos.add(modelo);
	}
	
	public void addInstancia(Instancia instancia){
		instancias.add(instancia);
	}
	
	public void removeUsuario(int login){
		for (int i = 0; i < usuarios.size(); i++){
			
			if(login == usuarios.get(i).getLogin()){
				usuarios.remove(i);
				System.out.println("Usuario removido");
				return;
			}
		}
		System.out.println("Usuario não encontrado");
		return;
	}

}

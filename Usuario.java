package entidade;

public class Usuario {
	private int login;
	private int senha;
	private String nome;
	
	public Usuario(int login, int senha, String nome){
		this.login = login;
		this. senha = senha;
		this.nome = nome;
	}
	
	public Usuario getUsuario(int login){
		if (login==this.login)
			return this;
		return null;
	}
	public int getLogin(){
		return this.login;
	}
	public void setLogin(int login){
		this.login = login;
	}
	
	public int getSenha(){
		return this.senha;
	}
	public void setSenha(int senha){
		this.senha = senha;
	}
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}

}

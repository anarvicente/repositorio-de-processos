package entidade;




import java.io.Serializable;
import java.util.ArrayList;

public class Modelo extends IOSerial implements Serializable {
	private int ID;
	private String desc, nome;
	private Regras regras;
	private Dominio dominio;
	
	
	public Modelo(){
        regras = new Regras();
        dominio = new Dominio();
        }
	
        public void print(){
            System.out.println(this.toString());
            dominio.print();
            regras.print();
        }
	public String toString() {
        return "ID: " + ID + "\nnome: " + nome + "\nDescricao: " + desc;
    }
	
        public void setId(int i){
            ID = i;
        }
	public int getId(){
		return ID;		
	}
	public String getDesc(){
		return desc;		
	}
	public String getNome(){
		return nome;		
	}
	
	public void setNome(String n){
		nome = n;		
	}
	
	public void setDesc(String d){
		desc = d;		
	}
	
	public void setRegra(Regra r){
		regras.setRegra(r);		
	}
	
	public Regra getRegra(int i){
		return(regras.getRegra(i));		
	}
	
	public void setDominio(ObjetodeFluxo d){
		dominio.setDominio(d);		
	}
	
	public ObjetodeFluxo getDominio(int i){
		return(dominio.getDominio(i));		
	}
        
        public Dominio getDominio(){
            return dominio;
        }
        
        public void printDominio(){
            dominio.print();
        }
        
        public void printRegras(){
            regras.print();
        }
}
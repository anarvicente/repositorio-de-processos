package entidade;

import java.io.Serializable;

public class Regra extends IOSerial implements Serializable {
	private TipoRegra tipo;
	private Dominio ladoEsquerdo, ladoDireito;
	
	public Regra(TipoRegra t){
		this.tipo = t;
                ladoEsquerdo = new Dominio();
                ladoDireito = new Dominio();
	}
	
	public void setEsquerdo(ObjetodeFluxo e){
		ladoEsquerdo.setDominio(e);
		
	}
	
	public void setDireito( ObjetodeFluxo d){
		ladoDireito.setDominio(d);
		
	}
	
	public void set2Lado( ObjetodeFluxo e, ObjetodeFluxo d){
		ladoEsquerdo.setDominio(e);
		ladoDireito.setDominio(d);
	}
	
	public ObjetodeFluxo getEsquerdo(int i){
		return ladoEsquerdo.getDominio(i);
		
	}
	
	public ObjetodeFluxo getDireito(int i){
		return ladoDireito.getDominio(i);
		
	}
        
        public Dominio getLE(){
            return ladoEsquerdo;
        }
        
        public Dominio getLD(){
            return ladoDireito;
        }
        
        public void print(){
            System.out.println(tipo.toString());
            ladoEsquerdo.print();
            ladoDireito.print();
        }
        
        public void imprimeRegra(){
            System.out.println(tipo.toString());
        }
	

}

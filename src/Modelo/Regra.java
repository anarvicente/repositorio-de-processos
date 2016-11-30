package entidade;

public class Regra {
	private TipoRegra tipo;
	private ConjuntoObjFluxo ladoEsquerdo, ladoDireito;
	
	public Regra(TipoRegra t){
		this.tipo = t;
	}
	
	public void setEsquerdo( ConjuntoObjFluxo e){
		ladoEsquerdo = e;
		
	}
	
	public void setDireito( ConjuntoObjFluxo d){
		ladoDireito = d;
		
	}
	
	public void set2Lado( ConjuntoObjFluxo e, ConjuntoObjFluxo d){
		ladoEsquerdo = e;
		ladoDireito = d;
		
	}
	
	public ConjuntoObjFluxo getEsquerdo(){
		return ladoEsquerdo = e;
		
	}
	
	public ConjuntoObjFluxo getDireito(){
		return ladoDireito;
		
	}
	

}

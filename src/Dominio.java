package entidade;

import java.util.ArrayList;

public class Dominio {
	private ArrayList<ObjetodeFluxo> lst;
	
	public Dominio(){
		lst = new ArrayList();
	}
	
	public void setDominio(ObjetodeFluxo o){
		lst.add(o);
	}
	
	public void setDominio(ObjetodeFluxo o, int i){
		lst.add(i, o);
	}
	
	public ObjetodeFluxo getDominio(int i){
		return lst.get(i);
	}
	
	
	
}

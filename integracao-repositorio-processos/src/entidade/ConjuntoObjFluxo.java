package entidade;

import java.io.Serializable;
import java.util.ArrayList;

public class ConjuntoObjFluxo  implements Serializable {
	private ArrayList<ObjetodeFluxo> lst;
	
	public ConjuntoObjFluxo(){
		lst = new ArrayList(10);
	}
	
	public void setCOF(ObjetodeFluxo o){
		lst.add(o);
	}
	
	public void setCOF(ObjetodeFluxo o, int i){
		lst.add(i, o);
	}
	
	public ObjetodeFluxo getCOF(int i){
		if (i < lst.size() && i > -1) {
			return lst.get(i);
		}
		else{
			return null;
		}
	}
	
	
	
}

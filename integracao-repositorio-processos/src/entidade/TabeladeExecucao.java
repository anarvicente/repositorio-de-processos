package entidade;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.List;

public class TabeladeExecucao extends IOSerial implements Serializable {
	
	/**
	 * 
	 */
    private static final long serialVersionUID = 1L;

    private List<ItemExecucao> tabela;

    public TabeladeExecucao() {
        tabela = new ArrayList();
    }

    public ItemExecucao getItem(int i) {
        if (i < tabela.size() && i > -1) {
            return tabela.get(i);
        } else {
            return null;
        }
    }

    public void addItem(ItemExecucao item) {
        tabela.add(item);
    }
     
    public void getSize(){
        tabela.size();
    }
    
    
}

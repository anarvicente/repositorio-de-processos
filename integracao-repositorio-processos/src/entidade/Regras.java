package entidade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Regras extends IOSerial implements Serializable{
    private ArrayList <Regra> regras;

    public Regras(){
            regras = new ArrayList<Regra>();
    }

    public void setRegra(Regra r){
            regras.add(r);
    }

    public void ImprimeRegras(){
            System.out.println(Arrays.toString(regras.toArray()));
    }

    public void setRegra(Regra r, int n){
            regras.add(n, r);
    }

    public Regra getRegra(int n){
            return(regras.get(n));
    }

    public void removeRegra(Regra r){
            regras.remove(r);
    }
    public void limparRegra(){
            regras.clear();
    }
    public void numRegra(){
            regras.size();
    }


    public void print(){
        int x = 0;
        Regra r;
        while (x < regras.size()){
            System.out.println("REGRA");
            r = regras.get(x);
            r.print();
            x++;  
        }
    }
}

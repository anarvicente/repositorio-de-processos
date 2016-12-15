package entidade;

import java.io.Serializable;
import java.util.ArrayList;

public class Dominio extends IOSerial implements Serializable {

    private ArrayList<ObjetodeFluxo> lst;

    public Dominio() {
        lst = new ArrayList(10);
    }
    
    public int getSize(){
        return lst.size();
    }
    
    public void setDominio(ObjetodeFluxo o) {
        lst.add(o);
    }

    public void setDominio(ObjetodeFluxo o, int i) {
        lst.add(i, o);
    }

    public ObjetodeFluxo getDominio(int i) {
        if (i < lst.size() && i > -1) {
            return lst.get(i);
        } else {
            return null;
        }
    }
    
    
    
    public void print() {
        int i;
        String s;
        ObjetodeFluxo var;
        
        System.out.println("DOMINIO");
        for (i = 0; i < lst.size(); i++) {
            var = lst.get(i);
            System.out.print("Tipo: ");
            if (var instanceof Evento) {
                System.out.println("Evento");
                s = ((Evento) var).toString();
            } else {
                s = ((Tarefa) var).toString();
                if (var instanceof Atividade) {
                    System.out.println("Atividade");
                } else {
                    System.out.println("SubProcesso");
                }
            }
            System.out.println(s);
        }
    }
/*
    public static void main(String[] args) {
        
        Dominio d = new Dominio();
        ObjetodeFluxo o1 = new Atividade();
        ObjetodeFluxo o2 = new SubProcesso();
        ObjetodeFluxo o3 = new Evento();
        TipoRecurso t1 = new Humano();
        TipoRecurso t2 = new Equipamento();
        
        ((Tarefa)o2).setTR(t1);
        ((Tarefa)o1).setTR(t2);
   
        
        d.setDominio(o3);
        d.setDominio(o2);
        d.setDominio(o1);
        
        
        d.printDominio();
    }*/

}

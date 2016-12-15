package Instancia;

import java.util.ArrayList;

/**
 *
 * @author douglas
 */
class DadosInstancia {
    public static ArrayList<Instancia> listaInstancia = new ArrayList<>();
    public static ArrayList<Recurso> listaRecurso = new ArrayList<>();
    public static ArrayList<RecursosDisponiveis> listaRecursosDisponiveis = new ArrayList<>();
}

public class DAOInstancia {
    public ArrayList<Instancia> getListaInstancia() {
        return DadosInstancia.listaInstancia;
    }
    
    public boolean salvarInstancia(Instancia obj) {
        if (obj.getId() == null) {
            obj.setId(DadosInstancia.listaInstancia.size() + 1);
            DadosInstancia.listaInstancia.add(obj);
        }
        return true;
    }
    
    public boolean removeInstancia(Instancia obj) {
        DadosInstancia.listaInstancia.remove(obj);
        return true;
    }
    
    public ArrayList<Recurso> getListaRecurso() {
        return DadosInstancia.listaRecurso;
    }
    
    public boolean salvarRecurso(Recurso obj) {
        if (obj.getId() == null) {
            obj.setId(DadosInstancia.listaRecurso.size() + 1);
            DadosInstancia.listaRecurso.add(obj);
        }
        return true;
    }
    
    public boolean removeRecurso(Recurso obj) {
        DadosInstancia.listaRecurso.remove(obj);
        return true;
    }
    
    public ArrayList<RecursosDisponiveis> getListaRecursosDisponiveis() {
        return DadosInstancia.listaRecursosDisponiveis;
    }
    
    public boolean salvarRecursosDisponiveis(RecursosDisponiveis obj) {
        if (obj.getId() == null) {
            obj.setId(DadosInstancia.listaRecursosDisponiveis.size() + 1);
            DadosInstancia.listaRecursosDisponiveis.add(obj);
        }
        return true;
    }
    
    public boolean removeRecursosDisponiveis(RecursosDisponiveis obj) {
        DadosInstancia.listaRecursosDisponiveis.remove(obj);
        return true;
    }
}

package controle;

import Instancia.Recurso;
import Serializador.*;
import fronteira.Saida;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author douglas
 */

public class DadosRecurso extends IOSerial implements Serializable {
    private Recurso recurso;
    private ArrayList<Long> listaIndices;
    private ArrayList<Recurso> listaRecurso;
    private EntryFile arquivo;
    
    public DadosRecurso() throws IOException {
        super();
        try {
            arquivo = new EntryFile("src/arquivos/arquivoRecursos");
        } catch(IOException ioe) {
            Saida.println("Ocorreu um erro inexperado:\n" + ioe);
        }
        this.listaIndices = arquivo.getLstIndex();
    }
    
    public Recurso getRecurso(int i) {
        return this.listaRecurso.get(i);
    }
    
    public ArrayList<Recurso> getListaRecurso() {
        this.listaRecurso = new ArrayList<>();
        try {
            for (int i = 0; i < listaIndices.size(); i++) {
                listaRecurso.add((Recurso)this.arquivo.read(listaIndices.get(i)));
            }
        } catch(ClassNotFoundException | NullPointerException | IOException n) {
            System.out.print("Ocorreu um erro inesperado: \n" + n);
        }
        return listaRecurso;
    }
    
    public boolean salvarRecurso(Recurso obj) {
        try {
            if (obj.getId() == null) {
                obj.setId(listaIndices.size() + 1);
                listaIndices.add(this.arquivo.append(obj));
            }
            return true;
        } catch (IOException ioe) {
            System.out.println("Ocorreu um erro inesperado e a instância não foi salva: \n" + ioe);
            return false;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    public void imprimeRecurso() {
        Saida.println("\nId\tNome\tTipo de Recurso\tDescrição");
        for(int i = 0; i < listaRecurso.size(); i ++) {
            listaRecurso.get(i).print();
        }
    }
}

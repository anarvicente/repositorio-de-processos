package controle;

import Instancia.RecursosDisponiveis;
import Serializador.*;
import fronteira.Saida;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author douglas
 */

public class DadosRecursosDisponiveis extends IOSerial implements Serializable {
    private RecursosDisponiveis recDisponiveis;
    private ArrayList<Long> listaIndices;
    private ArrayList<RecursosDisponiveis> listaRecDisponiveis;
    private EntryFile arquivo;
    
    public DadosRecursosDisponiveis() throws IOException {
        super();
        try {
            arquivo = new EntryFile("src/arquivos/arquivoRecursosDisponiveis");
        } catch(IOException ioe) {
            Saida.println("Ocorreu um erro inexperado:\n" + ioe);
        }
        this.listaIndices = arquivo.getLstIndex();
    }
    
    public RecursosDisponiveis getRecDisponiveis(int i) {
        return this.listaRecDisponiveis.get(i);
    }
    
    public ArrayList<RecursosDisponiveis> getListaRecDisponiveis() {
        RecursosDisponiveis obj;
        this.listaRecDisponiveis = new ArrayList<>();
        try {
            for (int i = 0; i < listaIndices.size(); i++) {
                 obj = (RecursosDisponiveis)this.arquivo.read(listaIndices.get(i));
                listaRecDisponiveis.add(obj);
            }
        } catch(ClassNotFoundException | NullPointerException | IOException n) {
            System.out.print("Ocorreu um erro inesperado: \n" + n);
        }
        return listaRecDisponiveis;
    }
    
    public boolean salvarRecDisponiveis(RecursosDisponiveis obj) {
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
    
    public boolean atualizaRecDisponiveis(long i, RecursosDisponiveis obj) {
        try {
            this.arquivo.update(i, obj);
            return true;
        } catch (IOException ioe) {
            System.out.println("Ocorreu um erro inesperado e a instância não foi alterada: \n" + ioe);
            return false;
        } catch (ClassNotFoundException e) {
            System.out.println(e);
            return false;
        }
    }
    
    public void imprimeRecDisponiveis() {
        Saida.println("\nId\tNome\tTipoRecurso\tDescrição");
        for(int i = 0; i < listaRecDisponiveis.size(); i ++) {
            listaRecDisponiveis.get(i).print();
        }
    }
}

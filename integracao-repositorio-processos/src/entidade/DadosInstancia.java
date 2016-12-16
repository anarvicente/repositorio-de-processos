package entidade;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author douglas
 */

public class DadosInstancia extends IOSerial implements Serializable {
    private Instancia instancia;
    private ArrayList<Long> listIndices;
    private ArrayList<Instancia> listaInstancia;
    private EntryFile arquivo;
    
    public DadosInstancia() throws IOException {
        super();
        try {
            arquivo = new EntryFile("src/arquivos/arquivoInstancias");
        } catch(IOException ioe) {
            Saida.println("Ocorreu um erro inexperado:\n" + ioe);
        }
        this.listIndices = arquivo.getLstIndex();
    }
    
    public int defineId() {
        return listIndices.size() + 1;
    }
    
    public Instancia getInstancia(int i) {
        return this.listaInstancia.get(i);
    }
    
    public ArrayList<Instancia> getListaInstancia() {
        this.listaInstancia = new ArrayList<>();
        try {
            for (int i = 0; i < listIndices.size(); i++) {
                listaInstancia.add((Instancia)this.arquivo.read(listIndices.get(i)));
            }
        } catch(ClassNotFoundException | NullPointerException | IOException n) {
            System.out.print("Ocorreu um erro inesperado: \n" + n);
        }
        return listaInstancia;
    }
    
    public boolean salvarInstancia(Instancia obj) {
        try {
            if (obj.getId() == null) {
                obj.setId(listIndices.size() + 1);
                listIndices.add(this.arquivo.append(obj));
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
    
    public boolean atualizaInstancia(long i, Instancia obj) {
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
    
    public void imprimeInstancias() {
        Saida.println("\nId\tNome\tDescrição");
        for(int i = 0; i < listaInstancia.size(); i ++) {
            listaInstancia.get(i).print();
        }
    }
}

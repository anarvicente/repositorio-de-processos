/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import Instancia.Recurso;
import Serializador.EntryFile;
import Serializador.IOSerial;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 20151bsi0401
 */
public class DadosRecurso extends IOSerial {
    private int quantRecursos;
    private List<Long> indexRecursos = new ArrayList<>();
    private List<Recurso> recursos = new ArrayList<>();
    private final EntryFile arquivoRecursos;

    public DadosRecurso() throws IOException {
        this.quantRecursos = 0;
        this.arquivoRecursos = new EntryFile("src/arquivos/arquivoRecursos");
    }
    
    public boolean salvarRecurso(Recurso recurso){
        if (recurso.getId() == null){
            recurso.setId(quantRecursos);
            quantRecursos++;
            try{
            indexRecursos.add(arquivoRecursos.append(recurso));
            //arquivoRecursos.close();
            }
            catch (IOException ex)
            {
                return false;
            }
            
        }
        
        return true;
    }
    
    public void lerArquivoRecursos(){
        for(int i=0;i<quantRecursos; i++){
            try{
                recursos.add((Recurso)arquivoRecursos.read(indexRecursos.get(i)));
            }
            catch(IOException ex){
                
            }
            catch(ClassNotFoundException ex){
                
            }
        }
        
    }
    
    public List<Recurso> imprimirRecursosDisponiveis(){
        Recurso recurso;
        lerArquivoRecursos();
        System.out.println(recursos.size());
        if (recursos.size() >= 0){
            for (Recurso recurso1 : recursos) {
                recurso = recurso1;
                if (recurso.isDisponibilidade())
                    recurso.imprimirRecurso();
            }
        }
        return recursos;
    }
}

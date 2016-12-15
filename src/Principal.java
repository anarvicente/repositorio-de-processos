import Instancia.*;
import controle.*;
import fronteira.*;
import java.io.IOException;
/**
 *
 * @author douglas
 */
public class Principal {
    public static void main(String[] args) throws IOException {
        DadosInstancia dadosInstancia = new DadosInstancia();
        Instancia inst;
        String nome, descricao;
        
        inst = new Instancia();
        nome = Entrada.leString("Nome da instância: ");
        inst.setNome(nome);
        descricao = Entrada.leString("Descrição da instância: ");
        inst.setDescricao(descricao);

        dadosInstancia.salvarInstancia(inst);
        
        dadosInstancia.getListaInstancia();
        dadosInstancia.imprimeInstancias();
    }
}

import Instancia.*;
import controle.*;
import fronteira.*;
import java.io.IOException;
/**
 *
 * @author douglas
 */
public class Principal {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DadosInstancia dadosInstancia = new DadosInstancia();
        Instancia inst;
        String nome, descricao;
        
        /*inst = new Instancia();
        nome = Entrada.leString("Nome da instância: ");
        inst.setNome(nome);
        descricao = Entrada.leString("Descrição da instância: ");
        inst.setDescricao(descricao);

        dadosInstancia.salvarInstancia(inst);
        */
        /*dadosInstancia.getListaInstancia();
        inst = dadosInstancia.getInstancia(6);
        inst.setNome("sss");
        inst.setDescricao("ggg");
        dadosInstancia.atualizaInstancia(6, inst);*/
        dadosInstancia.getListaInstancia();
        dadosInstancia.imprimeInstancias();
    }
}

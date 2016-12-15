import Instancia.Recurso;
import Modelo.Equipamento;
import Modelo.Humano;
import Modelo.TipoRecurso;
import controle.*;
import fronteira.*;
import java.io.IOException;
/**
 *
 * @author douglas
 */
public class Principal {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DadosRecurso dadosRecurso = new DadosRecurso();
        Recurso recurso;
        TipoRecurso tipoRecurso = null;
        int tipo = 2;
        /**
         * 
         * TOdo implementar interface para instância
         * Validar se foi selecionado um modelo primeiramente
         * Continuar implementação do menu de opções para instância
         * 
         */
        
        recurso = new Recurso();
        recurso.setNome(Entrada.leString("Nome do recurso: "));
        recurso.setDescricao(Entrada.leString("Descrição do recurso: "));
        recurso.setDisponivel(true);
        
        Saida.println("Tipo de recurso:");
        
        while (tipo < 0 || tipo > 1) {
            tipo = Entrada.leInt("0 - Humano\n1 - Equipamento\n");
            switch (tipo) {
                case 0:
                    tipoRecurso = new Humano();
                    ((Humano)tipoRecurso).setQualificacao(Entrada.leInt("Qualificação: "));
                    break;
                case 1:
                    tipoRecurso = new Equipamento();
                    ((Equipamento)tipoRecurso).setCodigoTipo(Entrada.leInt("Código do equipamento: "));
                    ((Equipamento)tipoRecurso).setDescricao(Entrada.leString("Descrição: "));
                    break;
            }
        }        
        recurso.setTipoRecurso(tipoRecurso);

        dadosRecurso.salvarRecurso(recurso);
        dadosRecurso.getListaRecurso();
        
        /*recurso = dadosRecurso.getRecurso(1);
        recurso.setNome("asd");
        recurso.setDescricao("lllllllllll");
        dadosRecurso.atualizaRecurso(1, recurso);
        dadosRecurso.getListaRecurso();*/
        dadosRecurso.imprimeRecurso();
    }
}

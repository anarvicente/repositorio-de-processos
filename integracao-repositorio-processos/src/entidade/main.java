/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author ana
 */
public class main extends IOSerial implements Serializable {

    /* ESCOLHER A INSTANCIA NA QUAL EU QUERO VER A TABELA DE EXECUCAO
       ISSO FICA NO MENU DA INSTANCIA */

    public static void main(String[] args) {

        
        
        
        Scanner ler = new Scanner(System.in);
        TabeladeExecucao table = new TabeladeExecucao();
        
        InterfaceM inter = new InterfaceM();


        try {
            EntryFile arquivo = new EntryFile("/home/ana/NetBeansProjects/integracao-repositorio-processos/testeModelo");
            Modelo m1;
            m1 = (Modelo) arquivo.read(0);
            inter.salvarArq("/home/ana/NetBeansProjects/integracao-repositorio-processos/testeModelo",m1);
            Dominio d = (Dominio) m1.getDominio();
            int tam = d.getSize();
            
            for(int i=0; i<tam;i++){
                table.addItem(new ItemExecucao(d.getDominio(i), false));
            }
            //Modelo m = (Modelo)arquivo.read(0);
            //*/
            /* Deixar generico escolher qual tabela usar */
            //TabeladeExecucao t = (TabeladeExecucao) arquivo.read(0);
            /* ID da tabela serah dado pela instacia */
            //int tam = t.tabela.size();

            System.out.println("TABELA DE EXECUCAO");
            for (int i = 0; i < tam; i++) {
                System.out.println(i + 1 + "- " + table.getItem(i).getItem().getNome());
            }
            
            /* Fazer um vetor de tarefas */
            System.out.println("Qual tarefa deseja iniciar ? ");
            int opcaoTarefa= ler.nextInt();
            table.getItem(opcaoTarefa - 1).setInicio();
            System.out.println("Tarefa " + table.getItem(opcaoTarefa-1).getItem().getNome() + " iniciada\n\n");

            System.out.println("1- Iniciar outra tarefa\n2- Terminar tarefa corrente\n");
            int opcao = ler.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Qual tarefa deseja iniciar ? ");
                    opcaoTarefa = ler.nextInt();
                    table.getItem(opcaoTarefa - 1).setInicio();
                    table.getItem(opcaoTarefa-1).setTerminado(false);
                    System.out.println("Tarefa " + table.getItem(opcao - 1).getItem().getNome() + " iniciada..\n");
                    /*Adicionar no vetor de tarefas iniciadas */
                    break;
                case 2:
                    table.getItem(opcaoTarefa-1).setTermino();
                    table.getItem(opcaoTarefa-1).setTerminado(true);
                    System.out.println("A tarefa " + table.getItem(opcaoTarefa-1).getItem().getNome() + " terminou..\n\n");
                
            }
            
            
            arquivo.append(table);
            /* Fazer um menu para finalizar */
            /* FALTA MARCAR O INICIO E O FIM E ATUALIZAR O ESTADO */
        } catch (Exception e) {
            System.out.println("Nao deu!");
        }

    }
}

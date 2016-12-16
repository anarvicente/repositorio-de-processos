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

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        TabeladeExecucao table = new TabeladeExecucao();        
        InterfaceM inter = new InterfaceM();

        try {
            EntryFile arquivo = new EntryFile("testeModelo");
            Modelo m1;
            m1 = (Modelo) arquivo.read(0);
            inter.salvarArq("testeModelo",m1);
            Dominio d = (Dominio) m1.getDominio();
            int tam = d.getSize(); /* qtd de ObjetodeFluxo */
            
            for(int i=0; i<tam;i++){
                table.addItem(new ItemExecucao(d.getDominio(i), false));
            }
            

            System.out.println("########### TABELA DE EXECUCAO ###########");
            for(int qtd= 0; qtd<tam;qtd++){
                for (int i = 0; i < tam; i++) {
                    if(!table.getItem(i).isTerminado()){
                        System.out.println((i+1) + "- " + table.getItem(i).getItem().getNome());
                    }
                }
                System.out.print("\nQual tarefa deseja iniciar ? ");
                int opcaoTarefa= ler.nextInt();
                table.getItem(opcaoTarefa-1).setInicio();
                System.out.println("\n#### " + table.getItem(opcaoTarefa-1).getItem().getNome() + " iniciada ###\n");
                
                System.out.println("O que deseja fazer agora ?");
                System.out.println("1- Iniciar outra tarefa\n2- Terminar tarefa corrente\n");
                int opcao = ler.nextInt();
                switch (opcao) {
                    case 1:
                        for (int i = 0; i < tam; i++) {
                            if(!table.getItem(i).isTerminado()){
                                System.out.println((i+1) + "- " + table.getItem(i).getItem().getNome());
                             }
                        }
                        System.out.print("Qual tarefa deseja iniciar ? ");
                        opcaoTarefa = ler.nextInt();
                        table.getItem(opcaoTarefa - 1).setInicio();
                        System.out.println("\n### " + table.getItem(opcao - 1).getItem().getNome() + " iniciada ###\n");

                        break;
                    case 2:
                        table.getItem(opcaoTarefa-1).setTermino();
                        table.getItem(opcaoTarefa-1).setTerminado(true);
                        System.out.println("### " + table.getItem(opcaoTarefa-1).getItem().getNome() + " terminada ###\n\n");
                        break;
                }
            }   
            
            System.out.println("Concluido com sucesso!");
            table.setConcluido(true);
            
            EntryFile saida = new EntryFile("tabela-execucao");
            saida.append(table);
            arquivo.close();
            saida.close();
            
        } catch (Exception e) {
            System.out.println("Nao deu!");
        }

    }
}

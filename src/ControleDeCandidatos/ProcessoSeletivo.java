package ControleDeCandidatos;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"Joao", "Felipe", "Maria", "Julio", "Ana", "Julia", "Rafaela"};
        for( String candidato : candidatos ) {
         entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato){
         int tentativasRealizadas = 1;
         boolean continuarTentando = true;
         boolean atendeu = false;

         do{
             atendeu = atender();
             continuarTentando = !atendeu;
             if(continuarTentando){
                 tentativasRealizadas++;
             } else {
                 System.out.println("Contato Realizado com sucesso");
             }
         }while(continuarTentando && tentativasRealizadas < 3);

         if (atendeu){
             System.out.println("Conseguimos contato com " + candidato + " Na " + tentativasRealizadas + " tentativas");
         } else {
             System.out.println("Não conseguimos contato com " + candidato + " Numero maximos de tentativas " + tentativasRealizadas);
         }
    }
    static  boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"Joao", "Felipe", "Maria", "Julio", "Ana", "Julia", "Rafaela"};
        for (int indice= 1; indice < candidatos.length; indice++) {
            System.out.println("O candidato de numero: " + indice + " é " + candidatos[indice]);
        }
    }

    static void selecaoDeCadidatos(){
        String [] candidatos = {"Joao", "Felipe", "Maria", "Julio", "Ana", "Julia", "Rafaela"};
         int candidatosSelecionados = 0;
         int candidatoAtual = 0;
         double salarioBase = 2000.0;
         while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
             String cadidato = candidatos[candidatoAtual];
             double salarioPretendido = valorPretentido();

             System.out.println("O candidato " + cadidato + " Solicitou este Valor de salario " + salarioPretendido);
             if(salarioBase >= salarioPretendido){
                 System.out.println("O candidato " + cadidato + " Selecionado para vaga!");
                 candidatosSelecionados++;
             }
             candidatoAtual++;
         }
    }

    static double valorPretentido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


    static void analisarCandidatos(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido ) {
            System.out.println("Ligar para candidato");
        } else if (salarioBase == salarioPretendido ) {
            System.out.println("Ligar para candidatos com contra proposta");
        } else {
            System.out.println("Aguardando Resultado de demais candidatos");
        }
    }
}

package Lista1_lab3.Exer5;

import Lista1_lab3.Funcoes.Cabessalho;

public class Pricipal {
    public static void main(String[] args) {
         int A,B;

        Cabessalho cabessalho = new Cabessalho("Laboratório de Programação 3","02/06/2025","Lista 1 Lab3","Liliane");
        cabessalho.imprimir();

         A = 5;
         B = 8;
         System.out.println("Varaveis antes da troca: ");
         System.out.println("A: " + A+"\nB: " + B);
         Variaveis a = new Variaveis(A,B);
         a.trocarValores();
         a.imprimirValores();

    }
}

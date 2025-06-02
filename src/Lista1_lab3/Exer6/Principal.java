package Lista1_lab3.Exer6;

import Lista1_lab3.Funcoes.Cabessalho;

public class Principal {
    public static void main(String[] args) {
        int A = 5;
        int B = 6;

        Cabessalho cabessalho = new Cabessalho("Laboratório de Programação 3","02/06/2025","Lista 1 Lab3","Liliane");
        cabessalho.imprimir();

        System.out.println("Varaveis antes da troca: ");
        System.out.println("A: " + A+"\nB: " + B);

        Variaveis a = new Variaveis(A,B);
        a.trocarValores();
        a.imprimirValores();
    }
}

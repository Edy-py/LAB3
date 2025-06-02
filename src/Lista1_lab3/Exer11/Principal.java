package Lista1_lab3.Exer11;


import Lista1_lab3.Funcoes.Cabessalho;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Cabessalho cabessalho = new Cabessalho("Laboratório de Programação 3","02/06/2025","Lista 1 Lab3","Liliane");
        cabessalho.imprimir();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma um numero inteiro: ");
        int idade = sc.nextInt();
        Tratamento maiorDeIdade = new Tratamento();
        maiorDeIdade.tratamento(idade);
    }
}

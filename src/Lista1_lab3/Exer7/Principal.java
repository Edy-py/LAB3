package Lista1_lab3.Exer7;

import Lista1_lab3.Funcoes.Cabessalho;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Cabessalho cabessalho = new Cabessalho("Laboratório de Programação 3","02/06/2025","Lista 1 Lab3","Liliane");
        cabessalho.imprimir();

        double cotacao, saldo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor da cotacao do dolar: ");
        cotacao = entrada.nextDouble();
        System.out.println("Digite o Valor (US$): ");
        saldo = entrada.nextDouble();
        Intercambio intercambio = new Intercambio(cotacao, saldo);
        double em_reais = intercambio.Converter();

        System.out.println("Seu saldo em reais (R$): R$ "+ em_reais);
    }
}

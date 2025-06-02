package Lista1_lab3.Exer8;

import Lista1_lab3.Funcoes.Cabessalho;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) {

        Cabessalho cabessalho = new Cabessalho("Laboratório de Programação 3","02/06/2025","Lista 1 Lab3","Liliane");
        cabessalho.imprimir();

        Scanner entrada = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.print("Digite o saldo: ");
        double saldoInformado = entrada.nextDouble();
        conta.setSaldo(saldoInformado);

        double saldoReajustado = conta.getSaldoReajustado();

        DecimalFormat formato = new DecimalFormat("#0.00");
        System.out.println("Saldo com reajuste de 1%: R$ " + formato.format(saldoReajustado));

    }

}

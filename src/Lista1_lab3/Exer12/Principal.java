package Lista1_lab3.Exer12;

import Lista1_lab3.Funcoes.Cabessalho;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) {

        Cabessalho cabessalho = new Cabessalho("Laboratório de Programação 3","02/06/2025","Lista 1 Lab3","Liliane");
        cabessalho.imprimir();

        Scanner entrada = new Scanner(System.in);
        ConversorTemperatura conversor = new ConversorTemperatura();

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double tempF = entrada.nextDouble();
        conversor.setFahrenheit(tempF);

        double tempC = conversor.converterParaCelsius();

        DecimalFormat formato = new DecimalFormat("#0.00");
        System.out.println("Temperatura em Celsius: " + formato.format(tempC) + " °C");
        }

}

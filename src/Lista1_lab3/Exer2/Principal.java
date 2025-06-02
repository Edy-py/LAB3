package Lista1_lab3.Exer2;

import Lista1_lab3.Funcoes.Cabessalho;

public class Principal {
    public static void main(String[] args) {

        Cabessalho cabessalho = new Cabessalho("Laboratório de Programação 3","02/06/2025","Lista 1 Lab3","Liliane");
        cabessalho.imprimir();

        Numeros m1 = new Numeros(8,9,7);
        Numeros m2 = new Numeros(4,5,6);
        float n1 = m1.media3num();
        float n2 = m2.media3num();
        Numeros m3 = new Numeros(n1,n2);
        System.out.println("Media 1: "+n1+"\nMedia 2: "+n2+"\nMedia 3: "+m3.media2num());

    }
}

package Lista1_lab3.Exer4;

import Lista1_lab3.Funcoes.Cabessalho;

public class Principal {
    public static void main(String[] args) {

        Cabessalho cabessalho = new Cabessalho("Laboratório de Programação 3","02/06/2025","Lista 1 Lab3","Liliane");
        cabessalho.imprimir();

        MediaPonderada media = new MediaPonderada(4,5,6,7);
        media.MostrarPonderada();
    }
}

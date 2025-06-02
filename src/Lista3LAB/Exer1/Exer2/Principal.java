package Lista3LAB.Exer1.Exer2;

import Lista3LAB.Exer1.Funcoes.Cabessalho;

public class Principal {
    public static void main(String[] args) {

        Cabessalho cabessalho = new Cabessalho("LAB3","30/05/2025","Exer2","Liliane");
        cabessalho.imprimir();

        Menu menu = new Menu();
        menu.menu();



    }
}

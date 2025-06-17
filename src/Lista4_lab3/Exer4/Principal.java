package Lista4_lab3.Exer4;

import Lista4_lab3.Exer1.*;
import Lista4_lab3.Funcoes.Cabessalho;

public class Principal {
    public static void main(String[] args) {

        Cabessalho cabessalho = new Cabessalho("Laboratório de Programação 3","16/06/2025","Lista 4 - LAB3","Liliane");
        cabessalho.imprimir();

        Animal[] zoo = Initi.iniciarZoo();
        for (int i = 0; i < zoo.length; i++) {
            if(zoo[i].toString().equals("preguica"))
                System.out.println("A preguica "+zoo[i].getNome()+" não pode correr!");
            else
                System.out.println(zoo[i].correr());
        }

    }
}

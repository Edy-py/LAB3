package Exer2;

import Funcoes.Cabessalho;
import Funcoes.EntradaUsuario;

public class Principal {
    public static void main(String[] args) {

        Cabessalho cabessalho = new Cabessalho("LAB3","30/05/2025","Exer2","Liliane");
        cabessalho.imprimir();

        Menu menu = new Menu();
        menu.menu();



    }
}

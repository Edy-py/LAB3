package Lista4_lab3.Exer2;

import Lista4_lab3.Exer1.*;
import Lista4_lab3.Funcoes.Cabessalho;

public class Principal {
    public static void main(String[] args) {

        Cabessalho cabessalho = new Cabessalho("LAB3","13/06/2025","Lista 4 - LAB3","Liliane");
        cabessalho.imprimir();

        Animal cachorro = new Cachorro();
        Animal cavalo = new Cavalo();
        Animal preguica = new Preguica();

        cachorro.setNome("Tóto");
        cachorro.setIdade(5);

        cavalo.setNome("Pangaré");
        cavalo.setIdade(3);

        preguica.setNome("Flash");
        preguica.setIdade(4);

        SelecionaAnimal seleciona = new SelecionaAnimal();
        seleciona.selecionaAnimal(cachorro);
        seleciona.selecionaAnimal(cavalo);
        seleciona.selecionaAnimal(preguica);

        }
    }


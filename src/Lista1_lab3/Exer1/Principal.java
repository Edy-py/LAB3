package Lista1_lab3.Exer1;

import Lista1_lab3.Funcoes.Cabessalho;

public class Principal {
    public static void main(String[] args) {

        Cabessalho cabessalho = new Cabessalho("Laboratório de Programação 3","02/06/2025","Árvore de Natal","Liliane");
        cabessalho.imprimir();

        ArvoreDeNatal arvore = new ArvoreDeNatal();
        arvore.imprimir();
    }
}


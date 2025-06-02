package Lista1_lab3.Exer3;

import Lista1_lab3.Funcoes.Cabessalho;

public class Principal {
    public static void main(String[] args) {

        Cabessalho cabessalho = new Cabessalho("Laboratório de Programação 3","02/06/2025","Lista 1 Lab3","Liliane");
        cabessalho.imprimir();

        Aluno aluno = new Aluno("Edilson",7,8,9);
        aluno.imprimir();
    }
}

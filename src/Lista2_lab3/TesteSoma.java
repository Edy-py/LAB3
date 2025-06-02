package Lista2_lab3;


import Lista2_lab3.Funcoes.Cabessalho;

public class TesteSoma {
    public static void main(String[] args) {
        Soma soma = new Soma(); // cria instância da classe
// Declara várias variáveis

        byte b = 20;
        short s = 99;
        int i = 1000;
        long l = 1234 ;
        float f = 3.1416F;
        double d = 2000;

        Cabessalho cabessalho = new Cabessalho("Laboratório de Programação 3","02/06/2025","Atividade em sala","Liliane");
        cabessalho.imprimir();

// Chama vários métodos da classe Soma
        System.out.println(soma.doisValores(b, s));
        System.out.println(soma.doisValores(i, s));
        System.out.println(soma.doisValores(i, i));
        System.out.println(soma.doisValores(l, b));
        System.out.println(soma.doisValores(f, s));
        System.out.println(soma.doisValores(d, b));
        System.out.println(soma.doisValores(b, d));
        System.out.println(soma.doisValores(i, l));
        System.out.println(soma.doisValores(l, l));
        System.out.println(soma.doisValores(d, f));
        }
    }




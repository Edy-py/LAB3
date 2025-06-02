package Lista1_lab3.Exer6;

public class Variaveis {
    int A, B;
    Variaveis(int a, int b){
        A = a;
        B = b;
    }
    void trocarValores(){
        A = A + B;
        B = A - B;
        A = A - B;
    }
    void imprimirValores(){
        System.out.println("Valores trocados: ");
        System.out.println("A: " + A+ "\nB: " + B);
    }
}


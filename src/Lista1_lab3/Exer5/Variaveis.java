package Lista1_lab3.Exer5;

public class Variaveis {
    int A, B;
    Variaveis(int a, int b){
        A = a;
        B = b;
    }
    void trocarValores(){
        int temp = A;
        A = B;
        B = temp;
    }
    void imprimirValores(){
        System.out.println("Valores trocados: ");
        System.out.println("A: " + A+ "\nB: " + B);
    }
}

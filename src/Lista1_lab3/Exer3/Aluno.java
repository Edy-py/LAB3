package Lista1_lab3.Exer3;

public class Aluno {
    String nome;
    float n1,n2,n3;

    Aluno(String nome,float n1,float n2,float n3){
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    void imprimir(){
        System.out.println("Nome: " + nome+"\nNota 1: " + n1+"\nNota 2: " + n2+"\nNota 3: " + n3+ "\nMedia final: "+(n1+n2+n3)/3);
    }
}

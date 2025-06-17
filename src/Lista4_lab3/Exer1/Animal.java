package Lista4_lab3.Exer1;

public class Animal {
    private String nome;
    private int idade;




    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String correr(){
        return "O animal está correndo... ";
    }

    public void FazerBarulho(){
        System.out.println("O animal está fazendo Barulho...");
    }
}

package Lista3_lab3.Exer1;

public class Pessoa {
    private String nome, cidade;
    private int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void VerificaIdade() {
        if (this.idade >= 0)
            return;
        else{
            System.out.println("Idade invalida! ");
            System.exit(0);
        }

    }
}

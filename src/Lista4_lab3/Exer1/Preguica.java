package Lista4_lab3.Exer1;

public class Preguica extends Animal{
    private String preguica(){
        return "está fazendo barulho -> BARULHO ";
    }
    public void FazerBarulho(){
        System.out.println("A preguiça "+getNome()+" tem "+ getIdade()+" anos de idade "+ preguica());
    }
    public String subirArvore(){
        return "A preguiça "+getNome()+" está subindo na árvore... ";
    }

    public String toString(){
        return "preguica";
    }
}

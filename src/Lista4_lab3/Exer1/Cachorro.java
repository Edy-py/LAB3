package Lista4_lab3.Exer1;

public class Cachorro extends Animal {

    private String late(){
        return "está latindo -> AUAU ";
    }
    public void FazerBarulho(){
        System.out.println("O cachorro "+getNome()+" tem "+ getIdade()+" anos de idade "+late());
    }
    public String correr(){
        return "O cachorro "+getNome()+" está correndo... ";
    }
    public String toString(){
        return "cachorro";
    }
}

package Lista4_lab3.Exer1;

public class Cavalo extends Animal{

    private String relincha(){
        return "está relinchando -> IIIRRRRI ";
    }
    public void FazerBarulho(){
        System.out.println("O cavalo "+getNome()+" tem "+ getIdade()+" anos de idade "+relincha());
    }
    public String correr(){
        return "O cavalo "+getNome()+" está correndo... ";
    }

    public String toString(){
        return "cavalo";
    }
}

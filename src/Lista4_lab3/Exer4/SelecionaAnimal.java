package Lista4_lab3.Exer4;

import java.util.Random;


public class SelecionaAnimal {
    public static int escolherAnimal() {
        Random random = new Random();
        int escolha;
        escolha = random.nextInt(3) + 1;
        return escolha;
    }


}

package Lista4_lab3.Exer4;

import Lista4_lab3.Exer1.*;

public class Initi extends SelecionaAnimal {
    public static Animal IniciarCachorro(){
        Animal cachorro = new Cachorro();
        cachorro.setNome("Tóto");
        cachorro.setIdade(5);
        return cachorro;
    }
    public static Animal IniciarCavalo(){
        Animal cavalo = new Cavalo();
        cavalo.setNome("Pangaré");
        cavalo.setIdade(3);
        return cavalo;
    }
    public static Animal IniciarPreguica(){
        Animal preguica = new Preguica();
        preguica.setNome("Flash");
        preguica.setIdade(10);
        return preguica;
    }

    public static Animal[] iniciarZoo() {
        Animal[] zoo = new Animal[10];

        for (int i = 0; i < 10; i++) {
            int escolhido = escolherAnimal();
            switch (escolhido) {
                case 1:
                    zoo[i] = Initi.IniciarCachorro();
                    break;
                case 2:
                    zoo[i] = Initi.IniciarCavalo();
                    break;
                case 3:
                    zoo[i] = Initi.IniciarPreguica();
                    break;
            }
        }
        return zoo;

    }
}

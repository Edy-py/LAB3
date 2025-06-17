package Lista4_lab3.Exer3;

import Lista4_lab3.Exer1.Animal;

public class Veterinario extends Animal {
    public void examinar(Animal a)throws Exception{
        System.out.println("O veterinário está examinando o animal: "+ a);
        Thread.sleep(5000); // aguardar 5 seg
        a.FazerBarulho();

    }


}

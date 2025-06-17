package Lista4_lab3.Exer7;

import Lista4_lab3.Exer5.*;


public class Initi {


    public static void initiBasico(FuncionarioBasico f1, int i){
        f1.addBonus();
        f1.setNome("Funcionario básico " + (i+1));
        f1.setCodigoFuncional("FUNCB"+ (i+1));
    }

    public static void initiMedio(FuncionarioMedio a1, int i){
        a1.addBonus();
        a1.setNome("Funcionario medio " + (i+1));
        a1.setCodigoFuncional("FUNCM"+(i+1));

    }

    public static void initiSuperior(FuncionarioSuperior b1, int i){
        b1.addBonus();
        b1.setNome("Funcionario Superior " + (i+1));
        b1.setCodigoFuncional("FUNCSP"+(i+1));


    }
}

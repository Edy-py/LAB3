package Lista4_lab3.Exer7;

import Lista4_lab3.Exer5.Funcionario;
import Lista4_lab3.Exer5.FuncionarioBasico;
import Lista4_lab3.Exer5.FuncionarioMedio;
import Lista4_lab3.Exer5.FuncionarioSuperior;
import Lista4_lab3.Funcoes.Cabessalho;

public class Principal {
    public static void main(String[] args) {

        Cabessalho cabessalho = new Cabessalho("Laboratório de Programação 3","16/062025","Lista 4 - LAB3", "Liliane");
        cabessalho.imprimir();

        // empresa com 10 funcionários
        Funcionario[] empresas = new Funcionario[10];


        // 40% funcionários nível basico
        for (int i = 4; i < 8; i++){
            empresas[i] = new FuncionarioBasico();
            Initi.initiBasico((FuncionarioBasico) empresas[i],i);
            //System.out.println(empresas[i]);
        }

        // 40% funcionários nível médio
        for (int i = 0; i < 4; i++){
            empresas[i] = new FuncionarioMedio();
            Initi.initiMedio((FuncionarioMedio) empresas[i],i);
           // System.out.println(empresas[i]);
        }


        // 20% funcionários nível superior
        for (int i = 8; i < 10; i++){
            empresas[i] = new FuncionarioSuperior();
            Initi.initiSuperior((FuncionarioSuperior) empresas[i],i);
           // System.out.println(empresas[i]);
        }

        double gastoDaEmpresa = 0;
        for (int i = 0; i < 10; i++){
            gastoDaEmpresa += empresas[i].getSalario();
        }

        for (int i = 0; i < 10; i++){
            System.out.println(empresas[i]);
        }
        
        System.out.println();
        System.out.println("Gasto mensal da empresa com salário dos funcionários: R$"+gastoDaEmpresa);

    }
}

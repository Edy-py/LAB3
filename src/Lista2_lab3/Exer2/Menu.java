package Lista2_lab3.Exer2;


import Lista1_lab3.Funcoes.EntradaUsuario;
import Lista3_lab3.Exer1.Funcoes.Cabessalho;


public class Menu {
    public void menu() {
        int opcao;

        Cabessalho cabessalho = new Cabessalho("Laboratório de Programação 3","02/06/2025","Atividade em sala","Liliane");
        cabessalho.imprimir();

        EntradaUsuario entradaSaldo = new EntradaUsuario("Digite o valor do deposito: R$ ");
        EntradaUsuario entradaSaldo2 = new EntradaUsuario("Digite o valor do saque: R$ ");

        EntradaUsuario entradaTitular = new EntradaUsuario("Digite Nome do titular:\n");
        EntradaUsuario entradaNumero = new EntradaUsuario("Digite Numero da sua conta:\n");

        ContaBancaria conta = new ContaBancaria();

        conta.setNomeTitular(entradaTitular.lerString());
        conta.setNumeroConta(entradaNumero.lerString());

        System.out.println("\nO que quer fazer?\n");
        EntradaUsuario entrada = new EntradaUsuario("Digite sua escolha: \n");

        do{
            System.out.println("[1] Ver saldo\n[2] Depositar\n[3] Sacar\n[-1] Sair\n");
            opcao = entrada.lerInt();
            switch(opcao){
                case 1:
                    System.out.println("Nome do Titular: "+ conta.getNomeTitular());
                    System.out.println("Número da conta: "+conta.getNumeroConta());
                    System.out.println("Seu saldo atual: R$ "+conta.getSaldo());
                    System.out.println();
                    break;

                case 2:
                    conta.depositar(entradaSaldo.lerDouble());
                    break;
                case 3:
                    conta.sacar(entradaSaldo2.lerDouble());
                    break;

                    default:
                        if (opcao != -1) {
                            System.out.println("Opção iválida!");
                            break;
                        }
            }
        }while (opcao != -1);
    }
}

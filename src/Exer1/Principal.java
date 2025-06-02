package Exer1;

import Funcoes.Cabessalho;
import Funcoes.EntradaUsuario;

public class Principal {
    public static void main(String[] args) {

        Cabessalho cabessalho = new Cabessalho("LAB3","30/05/2025","Lista 3 - Exer1","Liliane");
        cabessalho.imprimir();

        EntradaUsuario entradaNome = new EntradaUsuario("Digite seu nome: \n");
        EntradaUsuario entradaIdade = new EntradaUsuario("Digite sua idade: ");
        EntradaUsuario entradaCidade = new EntradaUsuario("Digite sua cidade:\n ");
        Pessoa pessoa = new Pessoa();

        pessoa.setNome(entradaNome.lerString());
        pessoa.setIdade(entradaIdade.lerInt());
        pessoa.VerificaIdade();
        pessoa.setCidade(entradaCidade.lerString());

        System.out.println();

        System.out.println("Nome: "+pessoa.getNome());
        System.out.println("Idade: "+pessoa.getIdade());
        System.out.println("Cidade: "+pessoa.getCidade());

    }

}

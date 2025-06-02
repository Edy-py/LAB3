package Lista1_lab3.Exer9;

import Lista1_lab3.Funcoes.Cabessalho;

public class Principal {
    public static void main(String[] args) {

        Cabessalho cabessalho = new Cabessalho("Laboratório de Programação 3","02/06/2025","Lista 1 Lab3","Liliane");
        cabessalho.imprimir();

        Imprssao impressao = new Imprssao();
        double preco = impressao.pegarPreco();
        Produto produto = new Produto(preco);
        double produto_desconto = produto.ProdutoComDesconto();
        impressao.imprimirPrecoFormatado(produto_desconto);
    }
}

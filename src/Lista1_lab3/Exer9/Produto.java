package Lista1_lab3.Exer9;
import java.util.Scanner;

public class Produto {
    double preco;

    Produto(double preco) {
        this.preco = preco;
    }
    public double ProdutoComDesconto(){
        return preco * 0.75;
    }



}

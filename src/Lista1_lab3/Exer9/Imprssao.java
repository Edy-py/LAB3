package Lista1_lab3.Exer9;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Imprssao {
    public double pegarPreco(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o preco do produto: ");
        return sc.nextDouble();
    }
    public void imprimirPrecoFormatado(double preco){
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Produto com desconto: R$ "+df.format(preco));
    }
}

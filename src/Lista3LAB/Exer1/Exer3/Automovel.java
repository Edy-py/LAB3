package Lista3LAB.Exer1.Exer3;

public class Automovel {

    private String marca;
    private String modelo;
    private int anoFabricacao;
    private String cor;
    private double velocidadeAtual = 0.0;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        if (anoFabricacao > 1885 && anoFabricacao <= 2025) { // Primeiros carros ~1886
            this.anoFabricacao = anoFabricacao;
        } else {
            System.out.println("Ano de fabricação inválido!");
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        if (velocidadeAtual >= 0 && velocidadeAtual <= 200) {
            this.velocidadeAtual = velocidadeAtual;
        } else {
            System.out.println("Velocidade inválida! Deve ser entre 0 e 200 km/h.");
        }
    }


    public void acelerar(double velocidade) {
        if (velocidade > 0) {
            double novaVelocidade = this.velocidadeAtual + velocidade;
            if (novaVelocidade > 200) {
                this.velocidadeAtual = 200;
                System.out.println("Velocidade máxima atingida!");
            } else {
                this.velocidadeAtual = novaVelocidade;
            }
        } else {
            System.out.println("Informe uma velocidade positiva para acelerar.");
        }
    }


    public void frear(double velocidade) {
        if (velocidade > 0) {
            double novaVelocidade = this.velocidadeAtual - velocidade;
            if (novaVelocidade < 0) {
                this.velocidadeAtual = 0;
            } else {
                this.velocidadeAtual = novaVelocidade;
            }
        } else {
            System.out.println("Informe uma velocidade positiva para frear.");
        }
    }
}
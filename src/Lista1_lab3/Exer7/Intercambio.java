package Lista1_lab3.Exer7;

public class Intercambio {
    double cotacao_dolar, quatidade_dolar;

    Intercambio(double cotacao_dolar, double quatidade_dolar) {
        this.cotacao_dolar = cotacao_dolar;
        this.quatidade_dolar = quatidade_dolar;
    }
    double Converter(){
        return cotacao_dolar * quatidade_dolar;
    }
}

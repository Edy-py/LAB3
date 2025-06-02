package Lista3_lab3.Exer2;

public class ContaBancaria {
    private double saldo = 0;
    private String nomeTitular,numeroConta;

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        if (saldo < 0)
            throw new IllegalArgumentException("Saldo negativo");
        this.saldo = saldo;
    }
    public String getNomeTitular() {
        return nomeTitular;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    public String getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor) {
        saldo += valor;
    }
    public void sacar(double valor) {
        if (saldo < valor)
            throw new IllegalArgumentException("Valor insuficiente");
        saldo -= valor;
    }


}

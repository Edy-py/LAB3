package Lista1_lab3.Exer8;



public class Conta {
    public double saldo;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoReajustado() {
        return saldo * 1.01;
    }
}
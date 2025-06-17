package Lista4_lab3.Exer5;

public class Funcionario {
    private String nome,codigoFuncional;
    private double salario = 1000.00;
    private int bonus;



    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCodigoFuncional(String codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getNome() {
        return nome;
    }
    public String getCodigoFuncional() {
        return codigoFuncional;
    }
    public double getSalario() {
        return salario;
    }
    public int getBonus() {
        return bonus;
    }



    public void addBonus() {
        System.out.println("Essa categoria não possui bonus!");
    }

    public String toString() {
        return ("\n=====Funcionério sem estudo====\nNome: " + nome + "\nCodigo: " + codigoFuncional + "\nSalário: R$ " + salario);
    }
}

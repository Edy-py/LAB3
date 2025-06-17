package Lista4_lab3.Exer5;

public class FuncionarioMedio extends Funcionario{


    public void addBonus() {
        FuncionarioBasico f = new FuncionarioBasico();
        f.addBonus();
        setBonus(50);
        setSalario(f.getSalario() + ((getBonus() * f.getSalario()/100)));
    }

    public String toString() {
        return ("\n=====Funcionério com nível médio====\nNome: " + getNome() + "\nCodigo: " + getCodigoFuncional() + "\nSalário: R$ " + getSalario());
    }

}

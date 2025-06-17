package Lista4_lab3.Exer5;

public class FuncionarioSuperior extends Funcionario{
    public void addBonus() {
        FuncionarioMedio f = new FuncionarioMedio();
        f.addBonus();
        setBonus(100);
        setSalario(f.getSalario() + ((getBonus() * f.getSalario()/100)));
    }
    public String toString() {
        return ("\n=====Funcionério com nível superior====\nNome: " + getNome() + "\nCodigo: " + getCodigoFuncional() + "\nSalário: R$ " + getSalario());
    }
}

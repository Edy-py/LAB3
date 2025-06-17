package Lista4_lab3.Exer5;

public class FuncionarioBasico extends Funcionario {

    public void addBonus() {
        setBonus(10);
        setSalario(getSalario() + ((getBonus() * getSalario()/100)));
    }

    public String toString() {
        return ("\n=====Funcionério com nível básico====\nNome: " + getNome() + "\nCodigo: " + getCodigoFuncional() + "\nSalário: R$ " + getSalario());
    }

}

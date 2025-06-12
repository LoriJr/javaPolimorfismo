package entities;

public class FuncionarioPJ extends Funcionario{

		
	public FuncionarioPJ(String name, double salarioBase, int mesesTrabalhados) {
		super(name, salarioBase, mesesTrabalhados);
	}

	@Override
	public double calcularSalario() {
		return getSalarioBase() * getMesesTrabalhados();
	}

}

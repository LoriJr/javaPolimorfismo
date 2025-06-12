package entities;

public class FuncionarioCLT extends Funcionario{
	
		
	public FuncionarioCLT() {
		super();
	}
	

	public FuncionarioCLT(String name, double salarioBase, int mesesTrabalhados) {
		super(name, salarioBase, mesesTrabalhados);		
	}



	public double decimoTerceiro() {
		if(getMesesTrabalhados() > 6) {
			return getSalarioBase() * 2.0;}
		else {
			return 0.0;
		}		
	}
	
	public double ferias() {
		return getSalarioBase() / 3;
	}
	
	@Override
	public double calcularSalario() {
		return (getSalarioBase() * getMesesTrabalhados()) + decimoTerceiro()+ferias();
	}

}

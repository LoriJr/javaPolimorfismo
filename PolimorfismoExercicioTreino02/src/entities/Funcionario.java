package entities;

public abstract class Funcionario {
	
	private String name;
	private double salarioBase;
	private int mesesTrabalhados;
	
	public Funcionario() {		
	}

	public Funcionario(String name, double salarioBase, int mesesTrabalhados) {
		this.name = name;
		this.salarioBase = salarioBase;
		this.mesesTrabalhados = mesesTrabalhados;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public int getMesesTrabalhados() {
		return mesesTrabalhados;
	}
	
	public void setMesesTrabalhados(int mesesTrabalhados) {
		this.mesesTrabalhados = mesesTrabalhados;
	}
	
	public abstract double calcularSalario();	
	

}

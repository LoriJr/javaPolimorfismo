package entities;


public class Animal {
	protected String nome;
	protected int idade;
	
	public Animal() {
		super();
	}

	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void fazerSom() {
		System.out.println("O som do animal é: ");
				
	}
	

}

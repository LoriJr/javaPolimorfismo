package entities;

public class Gato extends Animal{
	
	public Gato() {
		super();
	}

	public Gato(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void fazerSom() {
		System.out.println("miau miau! ");
				
	}

}

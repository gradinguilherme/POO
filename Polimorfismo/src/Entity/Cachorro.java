package Entity;

public class Cachorro extends Animal{
	
	protected double peso;
	
	public Cachorro(double peso, String nome) {
		super(nome);
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	@Override
	public void emiteSom() {
		System.out.println(getNome() + " faz Woof");
	}

}

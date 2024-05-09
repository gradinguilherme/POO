package Entity;

public class Gato extends Animal{
	
	protected double altura;
	
	public Gato(double altura, String nome) {
		super(nome);
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	@Override
	public void emiteSom() {
		System.out.println(getNome() + " faz Meow");
	}

}

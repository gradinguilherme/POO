package Entity;

public class Professor extends Pessoa{
	
	private String titulo;
	private double salario, inss;
	
	public Professor(String nome, int ano, String titulo, double salario) {
		super(nome, ano);
		
		this.titulo = titulo;
		this.salario = salario;
		
		calculaInss(salario);
	}
	
	private void calculaInss(double salario){
	
		if(salario < 1412.01) this.inss = salario * 0.075;
		else if(salario < 2666.69) this.inss = salario * 0.09;
		else if(salario < 4000.04) this.inss = salario * 0.12;
		else this.inss = salario * 0.14;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getInss() {
		return inss;
	}
	
}

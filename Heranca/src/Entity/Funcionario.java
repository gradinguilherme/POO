package Entity;

public class Funcionario extends Pessoa{
	
	private double salario, valorHora;
	private int horas;
	
	public Funcionario(String nome, int ano, int horas, double valorHora) {
		super(nome, ano);
		
		this.horas = horas;
		this.valorHora = valorHora;
		
		calculaSalario(horas, valorHora);
	}
	
	private void calculaSalario(int horas, double valorHora) {
		
		this.salario = valorHora*horas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getSalario() {
		return salario;
	}
	
}

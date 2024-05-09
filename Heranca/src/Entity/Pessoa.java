package Entity;

public class Pessoa {
	
	protected String nome;
	protected int ano, idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getIdade() {
		return idade;
	}
	
	private void calculaIdade(int ano) {
		this.idade = 2024-ano;
	}
	
	public Pessoa(String nome, int ano) {
		this.nome = nome;
		calculaIdade(ano);
	}

}

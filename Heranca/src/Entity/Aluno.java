package Entity;

public class Aluno extends Pessoa{

	private double mensalidade, desconto, pagamento;
	
	public Aluno(String nome, int ano, double mensalidade, double desconto) {
		super(nome, ano);
		
		this.mensalidade = mensalidade;
		this.desconto = desconto;
		
		calculaPagamento(mensalidade, desconto);
	}
	
	private void calculaPagamento(double mensalidade, double desconto) {
		
		this.pagamento = mensalidade - mensalidade * desconto;	
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public double getPagamento() {
		return pagamento;
	}
	
}

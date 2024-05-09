package Apply;

import Entity.*;

public class Main {

	public static void main(String[] args) {
		
		Professor prof = new Professor("Márcio", 1972, "Professor", 8420.36);
		System.out.println("Nome: " + prof.getNome() + ", Idade: " + prof.getIdade() + ", Título: " + prof.getTitulo() + ", Salário: " + prof.getSalario() + ", INSS: " + prof.getInss());
		
		Aluno al = new Aluno("Guilherme", 2004, 2314.04, 0.05);
		System.out.println("Nome: " + al.getNome() + ", Idade: " + al.getIdade() + ", Mensalidade: " + al.getMensalidade() + ", Desconto: " + al.getDesconto() + ", Pagamento: " + al.getPagamento());
		
		Funcionario func = new Funcionario("Roberto", 1983, 160, 30.50);
		System.out.println("Nome: " + func.getNome() + ", Idade: " + func.getIdade() + ", Horas Trabalhadas: " + func.getHoras() + ", Valor da Hora: " + func.getValorHora() + ", Salário: " + func.getSalario());
		
	}
}

package Entity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.TemporalUnit;

public class TeleAtivo extends Ligacao{
	
	private boolean ProdAceito; //Produto Aceito
	
	public TeleAtivo (boolean ProdAceito, Atendente a1, Cliente c1, int id, LocalDate data) {
		
		super(a1, c1, id, data);
		
		this.ProdAceito = ProdAceito;
	}

	public String isProdAceito() {
		String aceita = new String();
		if (this.ProdAceito==true) aceita = "Produto Aceito";
		else if(this.ProdAceito == false) aceita = "Produto Recusado";
		return aceita;
	}

	public void setProdAceito(boolean prodAceito) {
		ProdAceito = prodAceito;
	}
	
	@Override
	public void Chamada() {
		System.out.println("Atendente: "+super.a1.getNome());
		System.out.println("Cliente: "+super.c1.getNome()+", CPF: "+super.c1.getCpf());
		
		System.out.println("Atendente oferece o produto: Internet 100MB!");
		System.out.print("Decisão do Cliente: "+ isProdAceito());
	}
	
public void Gravar() throws IOException{
		
		String nome = "chamadaATV.txt";
		
		File arq = new File(nome);
		
		if(arq.createNewFile()) {
			System.out.println("Arquivo criado: "+ arq.getName()+ " com qtde de bytes: "+ arq.length());
		} else {
			System.out.println("Arquivo já existe "+ arq.getAbsoluteFile());
		}
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(nome, true));
		
		bw.write("Atendente: "+ a1.getNome()+"\n");
		bw.write("Cliente: "+c1.getNome()+", CPF: "+c1.getCpf()+"\n");
		bw.write("ID: "+getId()+"\n");
		
		bw.write("Decisão do Cliente: "+ isProdAceito());
		
		bw.close();
		
		System.out.println("--------------------------");
		
		BufferedReader br = new BufferedReader(new FileReader(nome));
		
		String linha;
		
		while((linha=br.readLine())!= null) {
			System.out.println(linha);
		}
		
		br.close();
		
	}
	
}

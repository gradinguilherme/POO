package Entity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Ligacao {
	
	protected Atendente a1;
	protected Cliente c1;
	protected int id;
	protected LocalDate data;
	
	public Ligacao(Atendente a1, Cliente c1, int id, LocalDate data) {
		this.a1 = a1;
		this.c1 = c1;
		this.id = id;
		this.data = data;
	}
	
	public Atendente getAtendente() {
		return a1;
	}
	public void setAtendente(Atendente a1) {
		this.a1 = a1;
	}
	public Cliente getCliente() {
		return c1;
	}
	public void setC1liente(Cliente c1) {
		this.c1 = c1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public void Chamada() {
		System.out.println("Atendente: "+a1.getNome());
		System.out.println("Cliente: "+c1.getNome()+", CPF: "+ c1.getCpf());
	}
	
public void Gravar() throws IOException{
		
		String nome = "chamada.txt";
		
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

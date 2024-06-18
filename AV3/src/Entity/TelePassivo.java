package Entity;

import java.io.IOException;
import java.time.LocalDate;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class TelePassivo extends Ligacao{
	
	private String tipo; //elogio, reclamação ou solicitação de informação
	private String msg; //mensagem
	
	public TelePassivo(String tipo, String msg, Atendente a1, Cliente c1, int id, LocalDate data) {
		
		super(a1, c1, id, data);
		
		this.tipo = tipo;
		this.msg = msg;
	}

	public String getTipo() {
		String type = new String();
		if(tipo == "elogio") type =  "elogiar.";
		else if (tipo == "reclama") type = "reclamar.";
		else if (tipo == "informa") type = "solicitar informação.";
		return type;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public void Chamada() {
		System.out.println("Atendente: "+super.a1.getNome());
		System.out.println("Cliente: "+super.c1.getNome()+", CPF: "+super.c1.getCpf());
		
		System.out.print("Cliente liga para "+ getTipo());
		System.out.print("Mensagem do cliente: " + getMsg());
	}
		
	@Override
	public void Gravar() throws IOException{
		
		String nome = "chamadaPS.txt";
		
		File arq = new File(nome);
		
		if(arq.createNewFile()) {
			System.out.println("Arquivo criado: "+ arq.getName()+ " com qtde de bytes: "+ arq.length());
		} else {
			System.out.println("Arquivo já existe "+ arq.getAbsoluteFile());
		}
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(nome, true));
		
		bw.write("Atendente: "+ super.a1.getNome()+"\n");
		bw.write("Cliente: "+super.c1.getNome()+", CPF: "+super.c1.getCpf()+"\n");
		bw.write("ID: "+super.getId()+"\n");
		
		bw.write("Cliente ligou para "+ getTipo() +"\n");
		bw.write("Mensagem do Cliente: " + getMsg());
		
		bw.close();
		
		System.out.println("--------------------------");
		
		BufferedReader br = new BufferedReader(new FileReader(nome));
		
		String linha;
		
		while((linha=br.readLine())!= null) {
			System.out.println(linha);
		}
		
		int c, i = 0;
		do {
			c=br.read();
			if(c!=-1) {
			i++;
			}
		}while (c!= -1);
		
		System.out.println("Quantidade de Caracteres = " + i);
		
		br.close();
		
	}
	
	
	
}

package Apply;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.Reader;
import java.io.FileReader;
import java.lang.StringBuilder;
import java.io.BufferedReader;

public class Arquivo {
	
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void abreArquivo() throws IOException{
		
		File arq = new File(this.nome);
		
		if(arq.createNewFile()) {
			System.out.println("Arquivo criado: "+ arq.getName()+ " com qtde de bytes: "+ arq.length());
		} else {
			System.out.println("Arquivo já existe "+ arq.getAbsoluteFile());
		}
	}
	
	public void gravaCaractereEString() throws IOException{
		Writer w = new FileWriter(this.nome);
		String txt = "Alô Mundo!";
		int i=0;
		
		while (i<txt.length()) {
			w.write(txt.charAt(i));
			i++;
		}
		w.write('\n');
		
		txt = "Hello world\n";
		w.write(txt);
		w.close();
		System.out.println("Frase gravada");
	}
	
	public void gravaNoFim() throws IOException{
		Writer w = new FileWriter(this.nome, true);
		String txt = "Hallo Welt\n";
		w.write(txt);
		w.close();
		System.out.println("Frase gravada no fim");
	}
	
	public void gravaBuffered() throws IOException{
		BufferedWriter b = new BufferedWriter(new FileWriter(this.nome, true));
		
		b.write("¡Hola Mundo!\n");
		b.write("Ni Hao Shijie!\n");
		b.write("Konichiwa Sekai!\n");
		
		b.close();
		
		System.out.println("Frases gravados pelo Buffered");
	}
	
	public void leCaractere() throws IOException{
		
		Reader r = new FileReader(this.nome);
		int c;
		
		System.out.println("Lendo o arquivo...");
		
		do {
			c=r.read();
			if(c!=-1) {
			System.out.print((char)(c));
			}
		}while (c!= -1);
		r.close();
	}
	
	public void leString() throws IOException{
		Reader r = new FileReader(this.nome);
		char[] array = new char[10];
		String txt;
		StringBuilder buffer = new StringBuilder();
		int q;
		while((q=r.read(array,0, array.length))!=-1) {
			buffer.append(array,0,q);
		}
		r.close();
		txt=buffer.toString();
		System.out.println("\n----------\n");
		System.out.println(txt);
		r.close();
	}
	
	public void leBuffered() throws IOException {
		BufferedReader b = new BufferedReader(new FileReader(this.nome));
		
		String linha = "--------\n";
		System.out.println(linha);
		
		while((linha=b.readLine())!= null) {
			System.out.println(linha);
		}
		b.close();
	}

	
	public static void main(String[] args) throws IOException{
		
		Arquivo arq = new Arquivo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do arquivo: ");
		arq.setNome(sc.nextLine()); //C:\Users\Acer\Desktop\Arquivos-Eclipse\teste-1.txt
		sc.close();	
		
		arq.abreArquivo();
		arq.gravaCaractereEString();
		arq.gravaNoFim();
		arq.gravaBuffered();
		
		arq.leCaractere();
		arq.leString();
		arq.leBuffered();
	}

}

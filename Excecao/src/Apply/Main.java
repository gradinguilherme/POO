package Apply;

import Entity.*;

public class Main {
	
	public static void excecao() throws ArithmeticException{
		int x=4, y=0;
		int z=x/y;
	}
	
	public static void main(String[] args) {
		int x=4, y=0, z;
		int[]k = new int[5];
		String nome=null;
		
		try {
			//nome.toUpperCase();
			//System.out.println("Nome: " + nome);
			//loginErrado();
			excecao();
			throw new Excecao();
			//z=x/y;
			//k[5]=7/0;
			
			
			
		} //catch(ArithmeticException e) {
			//System.out.println("Não é possivel fazer uma divisão por 0");
		//} catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println("Acesso incorreto ao vetor");
		//}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
			System.out.println(e.getMessage());
		}
		//catch(NullPointerException e) {
			//System.out.println(e.getMessage());
			//nome = "teste";
			//System.out.println("Nome: "+ nome.toUpperCase());
		//}
		catch(Exception e) {
			System.out.println("Erro 2024");
		}
		
		finally {
			System.out.println("Sempre aqui");
		}
		

	}

}

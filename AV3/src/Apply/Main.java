package Apply;

import java.io.IOException;
import java.time.LocalDate;

import Entity.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Atendente a1 = new Atendente("Jonas");
		Atendente a2 = new Atendente("Maria");
		
		Cliente c1 = new Cliente("Roberto", 00011122234);
		Cliente c2 = new Cliente("Clara", 00011122235);
		
		LocalDate d1 = LocalDate.of(2024, 5, 30);
		TeleAtivo ativo1 = new TeleAtivo(true, a1, c1, 15, d1);
		
		LocalDate d2 = LocalDate.of(2024, 6, 13);
		TelePassivo passivo1 = new TelePassivo("informa", "Vocês vendem internet?", a2, c2, 63, d2);
		
		ativo1.Chamada();
		ativo1.Gravar();
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		passivo1.Chamada();
		passivo1.Gravar();
		

	}

}

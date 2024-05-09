package Apply;

import Entity.*;

public class Main {
	
	public static void main( String[] args) {
		
		Animal animal = new Animal("Spark");
		animal.emiteSom();
		
		Cachorro cachorro = new Cachorro(55.4, "Scooby Doo");
		cachorro.emiteSom();
		
		Gato gato = new Gato(1.12, "Garfield");
		gato.emiteSom();
		
		Animal animal2 = new Gato(1.33, "Tobias");
		Animal animal3 = new Cachorro(26.5, "Bidu");
		
		animal2.emiteSom();
		animal3.emiteSom();
		
		animal = cachorro;
		
		animal.emiteSom();
	}
}

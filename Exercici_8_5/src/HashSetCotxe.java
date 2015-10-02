import java.util.HashSet;


public class HashSetCotxe {
	
	public static void main(String[] args) {
		// 1: Create a HashSet with 5 cars.
		HashSet<Cotxe> hashCotxes = new HashSet<Cotxe>();

		// 2: fill the Hash with the 5 given cars.
		hashCotxes.add(new Cotxe("Alfa Romeo", "Giulia", 2900, 6));
		Cotxe dacia = (new Cotxe("Dacia", "Sandero", 1200, 4));
		hashCotxes.add(dacia);
		hashCotxes.add(new Cotxe("Ford", "Focus", 2000, 4));
		hashCotxes.add(new Cotxe("Opel", "Insignia", 2200, 4));
		hashCotxes.add(new Cotxe("Seat", "Ibiza", 1600, 4));

		// 3: what fiscal horsepower does the Dacia have?
		if (hashCotxes.contains(dacia)) {
			System.out.println("La potencia fiscal del dacia és: " + dacia.getPotenciaFiscal());
		} else {
			System.out.println("Dacia no hi és dins del hashset");
		}
		
		// 4: Add 2 more cars.
		System.out.println("Puc afergir un cotxe no existent? ");
		System.out.println(hashCotxes.add(new Cotxe("Hyundai", "Atos", 1500, 3)));
		System.out.println("I un duplicat? ");
		System.out.println(hashCotxes.add(new Cotxe("Ford", "Focus", 2000, 4)));
		
		// 5: Can we add duplicates?
		System.out.println("No podem afegir duplicats!!");

		// 6: Try to insert a car at 1rs position.
		System.out.println("No podem inserir un cotxe a la primera posició perque el hash no te posicions");
		
		// 7: How can we replace a car for another one.
		System.out.println("Per substituir un cotxe per un altre primer hauriem de fer un remove i tot seguit un add");
		
		// 8: Show the list by using for each.
		
		System.out.println("-------For each-------");
		for (Cotxe c : hashCotxes) {
			System.out.println(c);
		}
		System.out.println("No, no estan ordenats");

	}
}


package capgemini;

public class Polimorfismo {

	public static void main(String[] args) {

		Mamifero mam1 = new Elefante();
		System.out.println("Cota Diaria de leite de um Elefante: " + mam1.cotaDiariaLeite());

		
		Mamifero mam2 = new Rato();
		System.out.println("Cota Diaria de leite de um Rato: " + mam2.cotaDiariaLeite());
	}

}

package capgemini;

public class RelacionaisLogicos {

	public static void main(String[] args) {
		// operadores relacionais
		// > < <= >= != ==
		
		// test equality ==
		int num1,  num2, num3, num4;
		num1 = 10;
		num2 = 10;
		
		if (num1 == num2) {
			System.out.println("Numero 1 e 2 são iguais");
		} else {
			System.out.println("Numeros são diferentes");
		}
		
		// test different !=
		num1 = 10;
		num2 = 20;
		
		if (num1 != num2) {
			System.out.println("Numero 1 e 2 são diferentes");
		} else {
			System.out.println("Numeros 1 e 2 são diferentes");
		}
		
		// test if bigger >
		num1 = 40;
		num2 = 20;
		
		if (num1 > num2) {
			System.out.println("Numero 1 é maior que numero 2");
		} else {
			System.out.println("Numeros 2 é maior que numero 1");
		}
		
		// operadores logicos
		// && = e; || = ou, or;
		
		num1 = 10;
		num2 = 5;
		num3 = 20;
		num4 = 20;
		
		if (num1 > num2  && (num2 == num4)) {
			System.out.println("Primeira opção satisfeita!");
		} else {
			System.out.println("Segunda opção satisfeita! ");
		}
		
		if (num1 > num2  || (num2 == num4)) {
			System.out.println("Primeira opção satisfeita!");
		} else {
			System.out.println("Segunda opção satisfeita! ");
		}
		

	}

}

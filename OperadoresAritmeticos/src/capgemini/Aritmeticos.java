package capgemini;

public class Aritmeticos {

	public static void main(String[] args) {
		int num1, num2, num3;
		
		num1 = 10;
		num2 = 20;
		
		// soma
	
		num3 = num1 + num2;
		
		System.out.println("O resultado da soma é: " + num3);
		
		// subtração
		
		num3 = num1 - num2;
				
		System.out.println("O resultado da subtração é: " + num3);
		
		// divisão
		
		num3 = num1 / num2;
						
		System.out.println("O resultado da divisão é: " + num3);
		
		// multiplicação
		
		num3 = num1 * num2;
						
		System.out.println("O resultado da multiplicação é: " + num3);
		System.out.println("----------------------------------------");

		// increment 
		num1 = 1;
		while (num1 <= 10) {
			System.out.println(num1);
			num1++;
		}
		
		System.out.println("----------------------------------------");
		
		// decrement 
		num1 = 10;
		while (num1 > 0) {
			System.out.println(num1);
			num1--;
		}
				

	}

}

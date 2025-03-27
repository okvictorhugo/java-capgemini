
package testeCalculadora;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		double num1 = scanner.nextDouble();
		System.out.println("Digite o segundo número: ");
		double num2 = scanner.nextDouble();
		System.out.println("Digite a operação matemática que deseja (+ (Soma), - (Subtração), * (Multiplicação), / (Divisão)): ");
		char operator = scanner.next().charAt(0);
		scanner.close();
		double result;

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if (num2 != 0) {
				result = num1 / num2;
			} else {
				System.out.println("Erro: Divisão por zero.");
				return;
			}
			break;
		default:
			System.out.println("Operação inválida.");
			return;
		}

		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	}
}

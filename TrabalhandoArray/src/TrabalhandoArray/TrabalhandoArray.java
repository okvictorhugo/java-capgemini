package TrabalhandoArray;

import javax.swing.JOptionPane;

public class TrabalhandoArray {

	public static void main(String[] args) {
		// declarando o array de paises
		
		String [] paises = new String[4];
		
		// declarando o array de numeros 
		
		int[] numeros = new int [10];
		
		// absatecendo o array de paises
		
		for (int i = 0; i < 4; i++) {
			paises [i] = JOptionPane.showInputDialog("Informe um país");
		}
		
		// listando o array de paises
		
		for (String listaPaises : paises) {
			System.out.println(listaPaises);
		}
		
		// abastecendo o array de numeros
		
		for (int j = 0; j < 10; j++) {
			numeros[j] = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
			
		}
		
		// listando o array de numeros - antes do calculo novoValor
		
		for (Integer listaNumeros : numeros) {
			System.out.println(listaNumeros);
		}
		
		int novoValor = 11;
		numeros [8] = novoValor + 4;
		
		// listando o array de numeros - depois do calculo novoValor
		
		for (Integer listaNumeros : numeros) {
			System.out.println(listaNumeros);
		}

	}

}

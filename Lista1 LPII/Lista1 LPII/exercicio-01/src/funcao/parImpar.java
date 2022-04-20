package funcao;

public class parImpar {

	public void impares(Double[] number) {
		System.out.println("Numeors impares:");
		for (int i = 0; i < number.length; i++)
			if (number[i] % 2 == 0)
				System.out.print(number[i] + " | ");
		System.out.println();
	}
	
	public void pares(Double[] number) {
		System.out.println("Numeros pares:");
		for (int i = 0; i < number.length; i++)
			if (number[i] % 2 == 1)
				System.out.print(number[i] + " | ");
		System.out.println();
	}
	
}

package funcao;

import java.util.*;

public class Leitor {

	Scanner read = new Scanner(System.in);

	public Integer quantityNumbers() {
		
		int qtd;
		
		System.out.printf("Informe a quantidade de n�meros a serem digitados: ");
		qtd = read.nextInt();
		
		return qtd;
	}

	public Double[] userNum(int qtd) {

		Double number[] = new Double[qtd];

		for (int i = 0; i < qtd; i++) {
			System.out.printf("Digite o " + (i + 1) + "Numero ");
			number[i] = read.nextDouble();
		}

		return number;
	}

}

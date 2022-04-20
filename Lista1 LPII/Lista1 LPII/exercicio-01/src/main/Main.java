package main;

import java.util.*;

import funcao.Leitor;
import funcao.Media;
import funcao.parImpar;

public class Main {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		Leitor input = new Leitor();
		Media mean = new Media();
		parImpar parity = new parImpar();

		int quantity = input.quantityNumbers();

		Double[] number = input.userNum(quantity);

		while (true) {
			System.out.println(" Selecione um item para obter um resultado: ");
			System.out.println("[1] - Media aritimetica");
			System.out.println("[2] - Media geometrica");
			System.out.println("[3] - Numeros pares");
			System.out.println("[4] - Numeros impares");
			System.out.println("[5] - Sair");

			int option = read.nextInt();

			switch (option) {
			case 1: {
				mean.mediaAritimetica(number);
			}
				break;
			case 2: {
				mean.mediaGeo(number);
			}
				break;
			case 3: {
				parity.impares(number);
			}
				break;
			case 4: {
				parity.pares(number);
			}
				break;
			case 5:
				return;
			default:
				System.out.println("Op��o inv�lida!");
			}
		}
	}
}

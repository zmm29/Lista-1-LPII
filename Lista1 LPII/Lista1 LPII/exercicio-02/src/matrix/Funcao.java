package matrix;

import java.util.Scanner;

public class Funcao {

	public void imprimirMatriz(Double[][] matriz) {

		int linha = matriz.length;
		int coluna = matriz[0].length;

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.printf(" " + matriz[i][j] + " |");
			}
			System.out.println();
		}
	}

	public void diagonalPrimaria(Double[][] matriz) {

		if (matriz.length == matriz[0].length) {
			int linha = matriz.length;
			int coluna = matriz[0].length;

			System.out.println("Diagonal principal:");
			
			for (int i = 0; i < linha; i++) {
				for (int j = 0; j < coluna; j++) {
					if (i == j) {
						System.out.printf(" " + matriz[i][j] + " |");
					}
				}
			}
			System.out.println();
		} else {
			System.out.println("O n�mero de linhas e colunas da matriz n�o s�o iguais!");
		}

	}

	public void diagonalSecundaria(Double[][] matriz) {

		if (matriz.length == matriz[0].length) {
			int line = matriz.length;
			int j = line - 1;

			System.out.println("Diagonal secundaria:");

			for (int i = 0; i < line; i++) {
				System.out.printf(" " + matriz[i][j--] + " |");
			}

			System.out.println();
		} else {
			System.out.println("O numero de linhas e colunas da matriz nao sao iguais!");
		}
	}

	public void matrizTransposta(Double[][] matriz) {

		Double[][] matrizTransposta = new Double[matriz[0].length][matriz.length];

		int line = matrizTransposta.length;
		int column = matrizTransposta[0].length;

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < column; j++) {
				matrizTransposta[i][j] = matriz[j][i];
				System.out.printf(" " + matrizTransposta[i][j] + " |");
			}
			System.out.println();
		}
	}

	public void somaMatriz(Double[][] matrixX, Double[][] matrixY) {
		if (matrixX.length == matrixY.length && matrixX[0].length == matrixY[0].length) {

			int line = matrixX.length;
			int column = matrixX[0].length;

			Double[][] sum = new Double[line][column];

			System.out.println("A soma das matrizes �:");

			for (int i = 0; i < line; i++) {
				for (int j = 0; j < column; j++) {
					sum[i][j] = matrixX[i][j] + matrixY[i][j];
					System.out.printf(" " + sum[i][j] + " |");
				}
				System.out.println();
			}
		} else {
			System.out.println(
					"A soma das matrizes n�o � poss�vel, pois o n�mero de linhas e colunas das mesmas n�o s�o iguais!");
		}
	}

	public void multiplicaMatriz(Double[][] matrixX, Double[][] matrixY) {
		if (matrixX[0].length == matrixY.length) {

			Double sum = 0.0;
			Double[][] mult = new Double[matrixX.length][matrixY[0].length];

			System.out.println("A multiplicação das matrizes :");

			for (int i = 0; i < matrixX.length; i++) {
				for (int j = 0; j < matrixY[0].length; j++) {
					for (int k = 0; k < matrixX[0].length; k++) {
						sum = sum + matrixX[i][k] * matrixY[k][j];
					}
					mult[i][j] = sum;
					sum = 0.0;
					System.out.printf(" " + mult[i][j] + " |");
				}
				System.out.println();
			}
		} else {
			System.out.println(
					"A multiplica��o das matrizes n�o � poss�vel, pois o n�mero de colunas da primeira matriz n�o � igual ao n�mero de linhas da segunda matriz!");
		}
	}

}

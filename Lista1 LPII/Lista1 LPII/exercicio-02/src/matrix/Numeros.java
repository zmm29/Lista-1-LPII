package matrix;

import java.util.Scanner;

public class Numeros {

	Scanner read = new Scanner(System.in);

	public Double[][] defineMatrix(int x, int y) {

		Double[][] matriz = new Double[x][y];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.printf("Digite um valor para a matriz [%d][%d], na posiçãoo [%d][%d]: ", x, y, i + 1, j + 1);
				matriz[i][j] = read.nextDouble();
			}
		}

		return matriz;
	}
}

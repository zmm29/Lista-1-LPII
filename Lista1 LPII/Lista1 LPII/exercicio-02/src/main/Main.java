package main;

import java.util.Scanner;

import matrix.Numeros;
import matrix.Funcao;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

		System.out.printf("Digite o valor de A: ");
		int a = read.nextInt();
		System.out.printf("Digite o valor de B: ");
		int b = read.nextInt();
		System.out.printf("Digite o valor de C: ");
		int c = read.nextInt();
		System.out.printf("Digite o valor de D: ");
		int d = read.nextInt();
		System.out.println();
		
		Numeros in = new Numeros();
		
		System.out.println("Declarando matriz A x B...");
		Double[][] matrixAB = in.defineMatrix(a, b);
		System.out.println("Declarando matriz C x D...");
		Double[][] matrixCD = in.defineMatrix(c, d);
		
		Funcao out = new Funcao();
		
		System.out.println("A matriz A x B ficou da seguinte forma:");
		out.imprimirMatriz(matrixAB);
		System.out.println("Verificando diagonal principal da matriz A x B...");
		out.primaryDiagonal(matrixAB);
		System.out.println("Verificando diagonal secund�ria da matriz A x B...");
		out.diagonalSecundaria(matrixAB);
		System.out.println("A matriz transposta de A x B :");
		out.matrizTranssposta(matrixAB);
	
		System.out.println("A matriz C x D ficou da seguinte forma:");
		out.imprimirMatriz(matrixCD);
		System.out.println("Verificando diagonal principal da matriz C x D...");
		out.primaryDiagonal(matrixCD);
		System.out.println("Verificando diagonal secund�ria da matriz C x D...");
		out.diagonalSecundaira(matrixCD);
		System.out.println("A matriz transposta de C x D �:");
		out.matrizTransposta(matrixCD);
		
		System.out.println("Verificando soma das matrizes A x B e C x D...");
		out.matrixSum(matrixAB, matrixCD);
		System.out.println("Verificando multiplica��o das matrizes A x B e C x D...");
		out.multiplicaMatriz(matrixAB, matrixCD);
	}
}

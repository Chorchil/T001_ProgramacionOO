package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Declare una matriz A[3,4], y desarrole un programa que vaya
		// solicitando cada una de sus posciciones
		Scanner entrada = new Scanner(System.in);
		char A[][] = new char[3][4];
		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 4; c++) {
				System.out.println("Ingrese el calor de la fila: " + f + " columna: " + c);
				char n = entrada.next().charAt(0);
				A[f][c] = n;
			}
		}
		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 4; c++) {
				System.out.print( A[f][c]+" ");
			}
			System.out.println();
		}
	
	// Ejercicio 2
		System.out.println("Ingrese el numero de filas de la matriz");
	
		int lf=entrada.nextInt();
		System.out.println("Ingrese el numero de columnas de la matriz");
		int lc=entrada.nextInt();
		char B[][] = new char[3][4];
		for (int f = 0; f < lf; f++) {
			for (int c = 0; c < lc; c++) {
				System.out.println("Ingrese el calor de la fila: " + f + " columna: " + c);
				char n = entrada.next().charAt(0);
				B[f][c] = n;
			}
		}
		System.out.println("Imprimimos la matriz");
		for (int f = 0; f < lf; f++) {
			for (int c = 0; c < lc; c++) {
				System.out.print( B[f][c]+" ");
			}
			System.out.println();
		}
	}
	

}

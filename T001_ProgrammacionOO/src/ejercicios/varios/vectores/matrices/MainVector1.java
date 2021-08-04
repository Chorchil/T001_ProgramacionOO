package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare un vector x[3] de tipo char y construya un programa que pida al
		// usuario que ingrese los valores para cada poscicion
		// y finalmente que se imprima todos los valores
		Scanner lector = new Scanner(System.in);
		char x[] = new char[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Ingrese el valor de la poscicion " + i);
			char n = lector.next().charAt(0);
			x[i] = n;
		}
		//recorriendo el vector lleno
		for(int i=0;i<3;i++) {
			System.out.println("El valor de la poscicion ES " + i);
			System.out.println(x[i]);

		}

	}

}

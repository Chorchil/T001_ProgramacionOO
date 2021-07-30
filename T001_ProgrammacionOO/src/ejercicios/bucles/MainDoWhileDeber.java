package ejercicios.bucles;

import java.util.Scanner;

public class MainDoWhileDeber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int SP = 0;
		int SI = 0;
		int CI = 0;
		int n = 0;
		float PI = 0;
		do {
			System.out.println("Ingrese un numero positivo:");
			n = entrada.nextInt();
			if (n % 2 == 0) {
				SP = SP + n;
			} else {
				SI = SI + n;
				CI = CI + 1;
				PI = SI / CI;
			}
		} while (n != 0);
		System.out.println("La suma de los pares es: " +SP);
		System.out.println("El promedio de los impares es: " +PI);
		System.out.println("Gracias ");
	}

}

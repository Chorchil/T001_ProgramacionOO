package ejercicios.vectores;

public class MainVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Declarar un vector mivector[10] de tipo int
		int miVector[] = new int[10];
		// 2. Declarar un vector miVector1[5] de tipo char
		char miVector1[] = new char[5];
		// 3. Declarar un vector miVec[4] de tipo char, y asignamos la letra 'A' a la
		// poscicion 0 y 2
		char miVec[] = new char[4];
		miVec[0] = 'A';
		miVec[2] = 'A';
		// 4. Declarar un vector miVec1[3] de tipo byte, y asignamos el numero0 a la
		// posciciones 0,1,2y3
		byte miVec1[] = new byte[3];
		miVec1[0] = 0;
		miVec1[1] = 0;
		miVec1[2] = 0;
		// miVec1[3]=0; esta es una mala asignacion por que esta fuera de rango
		// 5. Declarar un vector miVec2[3] de tipo char, y asignamos la letra 'A' a la
		// posciciones 0y1 y a la poscicion 2 le asignamos la letra 'B'
		char miVec2[] = new char[3];
		miVec2[0] = 'A';
		miVec2[1] = 'A';
		miVec2[2] = 'B';
		miVec2[0] = 'Z';
		System.out.println("Impresion 1: " + miVec2[0]);
		System.out.println("Impresion 2: " + miVec2[2]);
		

	}

}

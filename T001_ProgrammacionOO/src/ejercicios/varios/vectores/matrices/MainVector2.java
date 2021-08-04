package ejercicios.varios.vectores.matrices;
import java.util.Scanner;
public class MainVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare un vector x cuya longitud se solicite al usuario de tipo in y
		// construya un programa que pida al
		// usuario que ingrese los valores para cada poscicion
		// y finalmente que se imprima todos los valores
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingrese la longitud del vector");
		int l=entrada.nextInt();
		int x[]=new int[l];
		for (int i = 0; i < l; i++) {
			System.out.println("Ingrese el valor de la poscicion " + i);
			int n = entrada.nextInt();
			x[i] = n;
		}
		//recorriendo el vector lleno
		for(int i=0;i<l;i++) {
			System.out.println("El valor de la poscicion es " + i);
			System.out.println(x[i]);
			}

	}

}

package ejercicios.bucles;
import java.util.Scanner;
public class MainWhileDeber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector=new Scanner(System.in);
	

		int n=1;
		int s=0;
		float p=0;
		int c=0;
		while(n!=0) {
			System.out.println("Ingrese un numero positivo: ");
			n=lector.nextInt();
			if(n!=0) {
				c=c+1;
			}
				s=s+n;
				p=s/c;
			
		}
		System.out.println("La Suma de los numeros ingresados es : "+s);
		System.out.println("El Promedio de los numeros ingresados es : "+p);
		System.out.println("La Cantidad de los numeros ingresados es : "+c);
		System.out.println("Gracias ");

	

	}

}



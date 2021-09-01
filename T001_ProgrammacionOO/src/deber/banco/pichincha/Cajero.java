package deber.banco.pichincha;
import java.util.Scanner;
public class Cajero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector=new Scanner(System.in);

		System.out.println("*********************************");
		System.out.println("**Banco Pichincha seleccione una opcion: ");
		System.out.println("1.Retirar Dinero. \n 2.Cambiar Clave. \n 3.Bolquear Cuenta. \n 4.SALIR..");
		System.out.println("*********************************");
		int m=lector.nextInt();
		
			if(m==1) {
				System.out.println("Ingrese el valor a retirar");
				int va=lector.nextInt();
				System.out.println("El valor a retirar es: "+va);
				
				System.out.println("*********************************");
				System.out.println("**Banco Pichincha seleccione una opcion: ");
				System.out.println("1.Retirar Dinero. \n 2.Cambiar Clave. \n 3.Bolquear Cuenta. \n 4.SALIR..");
				System.out.println("*********************************");
				
			}
			else if(m==2) {
				System.out.println("Ingrese la nueva clave: ");
				int nc=lector.nextInt();
				System.out.println("Su clave ha sido cambiada.");
				System.out.println("*********************************");
				System.out.println("**Banco Pichincha seleccione una opcion: ");
				System.out.println("1.Retirar Dinero. \n 2.Cambiar Clave. \n 3.Bolquear Cuenta. \n 4.SALIR..");
				System.out.println("*********************************");
			}else if(m==3) {
				System.out.println("Su cuenta ha sido bloqueada");
				System.out.println("*********************************");
				System.out.println("**Banco Pichincha seleccione una opcion: ");
				System.out.println("1.Retirar Dinero. \n 2.Cambiar Clave. \n 3.Bolquear Cuenta. \n 4.SALIR..");
				System.out.println("*********************************");
			}else {
				System.out.println("Gracias vuelva pronto!");
			}
			
		}

	}



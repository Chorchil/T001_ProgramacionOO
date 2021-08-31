package prueba.avion;
import java.util.Arrays;
import java.util.Scanner;
public class MainAsignacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pasajero pvip1=new Pasajero();
		pvip1.setNombre("Dalis");
		pvip1.setApellido("Cedeño");
		pvip1.setEdad(18);
		pvip1.setMembresia("DE POR VIDA");
		
		
		Pasajero pvip2=new Pasajero();
		pvip2.setNombre("Jamilex");
		pvip2.setApellido("Rodriguez");
		pvip2.setEdad(21);
		pvip2.setMembresia("ANUAL");
		
		Pasajero pvip3=new Pasajero();
		pvip3.setNombre("Esteban");
		pvip3.setApellido("Cedeño");
		pvip3.setEdad(21);
		pvip3.setMembresia("MENSUAL");
		
		Pasajero pvip4=new Pasajero();
		pvip4.setNombre("Jose");
		pvip4.setApellido("Mena");
		pvip4.setEdad(30);
		pvip4.setMembresia("ANUAL");
		
		Pasajero pvip5=new Pasajero();
		pvip5.setNombre("Dolores");
		pvip5.setApellido("Rodriguez");
		pvip5.setEdad(48);
		pvip5.setMembresia("DE POR VIDA");
		
		Pasajero pvip6=new Pasajero();
		pvip6.setNombre("Victoria");
		pvip6.setApellido("Peñafiel");
		pvip6.setEdad(30);
		pvip6.setMembresia("DE POR VIDA");
		
		Pasajero pvip7=new Pasajero();
		pvip7.setNombre("Gabriel");
		pvip7.setApellido("Cedeño");
		pvip7.setEdad(39);
		pvip7.setMembresia("ANUAL");
		
		Pasajero pvip8=new Pasajero();
		pvip8.setNombre("Hevert");
		pvip8.setApellido("Rodriguez");
		pvip8.setEdad(29);
		pvip8.setMembresia("SEMANAL");
		
		Pasajero pvip9=new Pasajero();
		pvip9.setNombre("Jean");
		pvip9.setApellido("Cedeño");
		pvip9.setEdad(23);
		pvip9.setMembresia("MENSUAL");
		
		Pasajero pvip10=new Pasajero();
		pvip10.setNombre("Pierre");
		pvip10.setApellido("Rodriguez");
		pvip10.setEdad(20);
		pvip10.setMembresia("MENSUAL");
		
		Pasajero pce1=new Pasajero();
		pce1.setNombre("Jordan");
		pce1.setApellido("Cedeño");
		pce1.setEdad(21);
		pce1.setCodigo("ECU255");
		
		Pasajero pce2=new Pasajero();
		pce2.setNombre("Denis");
		pce2.setApellido("Rodriguez");
		pce2.setEdad(21);
		pce2.setCodigo("ECU255");
		
		Pasajero pce3=new Pasajero();
		pce3.setNombre("Didier");
		pce3.setApellido("Lopez");
		pce3.setEdad(21);
		pce3.setCodigo("ECU255");
		
		Pasajero pce4=new Pasajero();
		pce4.setNombre("Jhair");
		pce4.setApellido("Gallardo");
		pce4.setEdad(21);
		pce4.setCodigo("ECU255");
		
		Pasajero pce5=new Pasajero();
		pce5.setNombre("Genesis");
		pce5.setApellido("Mensias");
		pce5.setEdad(21);
		pce5.setCodigo("ECU255");
		
		Pasajero pce6=new Pasajero();
		pce6.setNombre("Ibeth");
		pce6.setApellido("Caseres");
		pce6.setEdad(21);
		pce6.setCodigo("ECU255");
		
		Pasajero pce7=new Pasajero();
		pce7.setNombre("Andy");
		pce7.setApellido("Pasmiño");
		pce7.setEdad(21);
		pce7.setCodigo("ECU255");
		
		Pasajero pce8=new Pasajero();
		pce8.setNombre("Ivan");
		pce8.setApellido("Erazo");
		pce8.setEdad(21);
		pce8.setCodigo("ECU255");
		
		Pasajero pce9=new Pasajero();
		pce9.setNombre("Marcos");
		pce9.setApellido("Piuri");
		pce9.setEdad(21);
		pce9.setCodigo("ECU255");
		
		Pasajero pce10=new Pasajero();
		pce10.setNombre("Henry");
		pce10.setApellido("Cumbal");
		pce10.setEdad(21);
		pce10.setCodigo("ECU255");
		
		
		Pasajero asignacion[][]=new Pasajero[4][5];
		asignacion[0][0]=pvip1;
		asignacion[0][1]=pvip2;
		asignacion[0][2]=pvip3;
		asignacion[0][3]=pvip4;
		asignacion[0][4]=pvip5;
		asignacion[1][0]=pce1;
		asignacion[1][1]=pce2;
		asignacion[1][2]=pce3;
		asignacion[1][3]=pce4;
		asignacion[1][4]=pce5;
		asignacion[2][0]=pce6;
		asignacion[2][1]=pce7;
		asignacion[2][2]=pce8;
		asignacion[2][3]=pce9;
		asignacion[2][4]=pce10;
		asignacion[3][0]=pvip2;
		asignacion[3][1]=pvip2;
		asignacion[3][2]=pvip2;
		asignacion[3][3]=pvip2;
		asignacion[3][4]=pvip2;
		
		System.out.println("Bienvenido a vuelos el nuevo mundo ");
		System.out.println("Estos son los asientos para el vuelo a Lordran");
		System.out.println(Arrays.toString(asignacion));

		
	}

}

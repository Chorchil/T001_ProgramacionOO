package ejercicios.ordenamiento;

import java.util.Arrays;

public class MainNomina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado juan=new Empleado();
		juan.setNombre("Juan");
		juan.setApellido("Carrasco");
		juan.setEdad(23);
		juan.setSalario(230);
		
		Empleado dayana=new Empleado();
		dayana.setNombre("Dayana");
		dayana.setApellido("Guaman");
		dayana.setEdad(21);
		dayana.setSalario(500);
		
		Empleado iris=new Empleado();
		iris.setNombre("Iris");
		iris.setApellido("Poveda");
		iris.setEdad(22);
		iris.setSalario(750);
		
		Empleado nayeli=new Empleado();
		nayeli.setNombre("Nayeli");
		nayeli.setApellido("Besoar");
		nayeli.setEdad(30);
		nayeli.setSalario(150);
		
		Empleado benito=new Empleado();
		benito.setNombre("Benito");
		benito.setApellido("Juarez");
		benito.setEdad(18);
		benito.setSalario(410);
		
		Empleado henry=new Empleado();
		henry.setNombre("Henry");
		henry.setApellido("Bombeador");
		henry.setEdad(19);
		henry.setSalario(200);
		
		Empleado marcos=new Empleado();
		marcos.setNombre("Marcos");
		marcos.setApellido("Black");
		marcos.setEdad(21);
		marcos.setSalario(235);
		
		Empleado andy=new Empleado();
		andy.setNombre("Andy");
		andy.setApellido("Pasmo");
		andy.setEdad(23);
		andy.setSalario(230);
		
		Empleado miguel=new Empleado();
		miguel.setNombre("Miguel");
		miguel.setApellido("Currasco");
		miguel.setEdad(56);
		miguel.setSalario(700);
		
		Empleado didier=new Empleado();
		didier.setNombre("Didier");
		didier.setApellido("Lopez");
		didier.setEdad(15);
		didier.setSalario(50);
		
		Empleado nominaEmpleados[]=new Empleado[10];
		nominaEmpleados[0]=juan;
		nominaEmpleados[1]=dayana;
		nominaEmpleados[2]=iris;
		nominaEmpleados[3]=nayeli;
		nominaEmpleados[4]=benito;
		nominaEmpleados[5]=henry;
		nominaEmpleados[6]=marcos;
		nominaEmpleados[7]=andy;
		nominaEmpleados[8]=miguel;
		nominaEmpleados[9]=didier;

		System.out.println("Bienvenidos a GPF, a continuacion se mostrara la nomina del departamento de ventas: ");
		System.out.println("Nomina sin ordenar: ");
		System.out.println(Arrays.toString(nominaEmpleados));
		Arrays.sort(nominaEmpleados);
		System.out.println("Nomina ordenada y lista");
		System.out.println(Arrays.toString(nominaEmpleados));

	}

}

package ejercicios.ordenamiento;

import java.util.Arrays;

public class MainPrimerClase {



public static void main(String[] args) {
// TODO Auto-generated method stub
// 1 primer dia de clase
// El profesor nos da nuestro número lista



Estudiante danilo = new Estudiante();
danilo.setNombre("Danilo");
danilo.setApellido("Albarracin");
danilo.setNumeroLista(1);
danilo.setEdad(19);




Estudiante andres = new Estudiante();
andres.setNombre("Andres");
andres.setApellido("Asitimbay");
andres.setNumeroLista(2);
andres.setEdad(21);



Estudiante alex = new Estudiante();
alex.setNombre("Alex");
alex.setApellido("Pachacama");
alex.setNumeroLista(22);
alex.setEdad(22);


Estudiante stefany = new Estudiante();
stefany.setNombre("Stefany");
stefany.setApellido("Cruz");
stefany.setNumeroLista(10);
stefany.setEdad(23);


Estudiante jhonny = new Estudiante();
jhonny.setNombre("Jhonny");
jhonny.setApellido("Ninabanda");
jhonny.setNumeroLista(21);
jhonny.setEdad(19);



// Alex dame tu nuemro de lista
System.out.println("Inge. soy el: " + alex.getNumeroLista());
System.out.println("Inge. soy el: " + jhonny.getNumeroLista());



Estudiante listaEstudiantes[] = new Estudiante[5];
listaEstudiantes[0] = danilo;
listaEstudiantes[1] = andres;
listaEstudiantes[2] = alex;
listaEstudiantes[3] = stefany;
listaEstudiantes[4] = jhonny;

//Vector antes de ordenar
System.out.println("Estudiantes antes de ordenar");
System.out.println(Arrays.toString(listaEstudiantes));

//Aqui ordeno la lista
Arrays.sort(listaEstudiantes);
System.out.println("Estudiantes despues de ordenar");
System.out.println(Arrays.toString(listaEstudiantes));



}



}
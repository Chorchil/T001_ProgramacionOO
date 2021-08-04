package ejercicios.varios.vectores.matrices;

public class MainDeberVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1 Declarar un vector x(8)
		int x[]=new int [8];
		//2 Declarar un vector y(3) y la segunda poscicion vale A
		char y[]=new char[3];
		y[2]='A';
		//3 Declarar un vector A(5) y asignar el valor 25 a la poscicion 0 y 
		//a la poscicion 2 el valor de la poscicion 0 y el valor de 49 a la tercera poscicion  
		int A[]= new int [5];
		A[0]=25;
		A[2]=25;
		A[3]=49;
		//4 Declarar un vector B(10), a la poscicion B[0] asignele el valor del vector A [3] ejercicio anterior
		int B[]= new int [10];
		B[0]=A[3];
		//5 Declarar un vector Z(12) y asignar a tos las pos valores desde 1 y son secuenciales 
		int Z[]=new int[12];
		Z[0]=1;
		Z[1]=2;
		Z[2]=3;
		Z[3]=4;
		Z[4]=5;
		Z[5]=6;
		Z[6]=7;
		Z[7]=8;
		Z[8]=9;
		Z[9]=10;
		Z[10]=11;
		Z[11]=12;
		//6 Declarar v Y(10) y asignar a todas las pos valores desde 1 valores impares y son secuenciales 
		int Y[]=new int[10];
		Y[0]=1;
		Y[1]=3;
		Y[2]=5;
		Y[3]=7;
		Y[4]=9;
		Y[5]=11;
		Y[6]=13;
		Y[7]=15;
		Y[8]=17;
		Y[9]=19;
		//7 Declarar H(10) y asignar solo a las pos impares letras desde la A secuencialmente
		char H[]=new char[10];
	
		H[1]='A';
	
		H[3]='B';

		H[5]='C';
	
		H[7]='D';
	
		H[9]='E';
		//8 Declarar F(10),
		//en base a H asignar los valores de la siguiente manera:F[0]=H[3];F[3]=H[2];F[4]=H[6];F[7]=H[0];F[8]=H[1];F[9]=H[9]
		char F[]=new char[10];
		F[0]=H[3];
	
		F[3]=H[2];
		F[4]=H[6];
	
		F[7]=H[0];
		F[8]=H[1];
		F[9]=H[9];
		//9 Declarar un vector L (15) en base a lo siguiente:
		//L[0]=(promedio 3,5,7y9);L[4]=(suma 5,7,8,15);L[7]=(la multiplicacion de 6,7 y 3);L[10]=(la division de 10/2)
		int L[]=new int[15];
		L[0]=6;
		L[4]=35;
		L[7]=126;
		L[10]=5;
		//10 Declarar un vector N(12) y realizar las siguientes asignaciones :
		//N[0]=(promedio 3,10y9);N[4]=(suma 7,8,10);N[12]=(la multiplicacion de 5,7 y 3);N[20]=(la suma 7,-3 y 8) y en la ultima poscicion el valor de 20/4
		int N[]=new int [12];
		N[0]=7;
		N[4]=25;
		//N[20]=Error!!! No existe esa poscicion
		N[11]=105;
	}

}

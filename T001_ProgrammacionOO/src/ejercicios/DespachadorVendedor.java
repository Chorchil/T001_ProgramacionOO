
package deber.metodos;

public class DespachadorVendedor {
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Debe verificar si hay el producto en existencia en la bodega
		//Debe verificar el precio 
		//Debe entregar el producto al cliente
		Bodega cliente1=new Bodega();// Instanciar la clase
		cliente1.despachar("Amortiguador", 2, 100,25);
		System.out.println("Final del programa");

	}

}

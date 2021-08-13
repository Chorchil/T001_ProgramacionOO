// 1.Declaracion del paquete
package deber.metodos;

// 2.Declaracion de importaciones
// En este caso no se uso ninguna importacion

// 3. Comentarios
// Esta clase se dedica a proveer productos a despachar o bender y mantener un inventario

// 4.Declaracion de la clase

public class Bodega {
	
	//5.Constantes
		//6.Variables
		public String Nombre_Producto;
		public int Restante_Inventario=10;
		
		//7.Constructor
		public Bodega() {
			
		}
		
		//8. Metodos
		public void despachar(String Producto, int Cantidad, int Restante_Inventario,int Precio_Producto) {
			System.out.println("Tienda de Repuestos Automotrices Familia");
			System.out.println("Producto: "+Producto);
			System.out.println("Cantidad: "+ Cantidad);
			System.out.println("Precio Indivudual: "+Precio_Producto);
			System.out.println("Precio Total: "+(Cantidad*Precio_Producto));
			System.out.println("Gracias por preferirnos");
			System.out.println("Y como dice Toreto 'La Familia Primero'");
		}
		
}

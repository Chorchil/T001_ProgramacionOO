package prueba.avion;

public class Pasajero {
	private String nombre;
	private String apellido;
	private int edad;
	private String membresia;
	private String codigo;
	private int asiento;

	
	public int getAsiento() {
		return asiento;
	}
	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getMembresia() {
		return membresia;
	}
	public void setMembresia(String membresia) {
		this.membresia = membresia;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "Pasajero [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", membresia=" + membresia
				+ ", codigo=" + codigo + ", asiento=" + asiento + "]";


}
}
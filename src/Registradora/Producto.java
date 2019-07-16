package Registradora;

public class Producto {
	int articulo;
	int talle;
	String nombre;
	Producto siguiente;
	
	public Producto(int arti, int talle, String nombre){
		this.articulo = arti;
		this.talle = talle;
		this.nombre = nombre;
	}
	
	void mostrar(){
		System.out.println(nombre +" -> Articulo: "+ this.articulo + " en talle: " + talle);
	}
}

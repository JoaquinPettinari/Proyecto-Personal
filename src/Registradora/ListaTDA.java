package Registradora;
import java.util.Scanner;


public class ListaTDA {
	Producto primero;
	
	public ListaTDA(){
		this.primero = null;
	}
	
	public void agregarProducto(){
		Scanner teclado = new Scanner(System.in);
		boolean seguir = true;
		
		while(seguir){
			System.out.print("\n Ingrese el nombre del producto: ");
			Scanner string = new Scanner(System.in);
			String nombre;
			nombre = string.nextLine();
			
			System.out.print(" Ingrese el articulo: ");
			int articulo = teclado.nextInt();
			
			System.out.print(" Ingrese el talle: ");
			int talle = teclado.nextInt();
			
			Producto nuevo = new Producto(articulo, talle, nombre);
			
			if(this.primero == null) {
				this.primero = nuevo;
			}
			else {
				Producto actual = this.primero;
				while (actual.siguiente != null) {
					actual = actual.siguiente;
				}
				actual.siguiente = nuevo;
			}
			System.out.println("\nProducto agregado a la perfeccion :) ");
			System.out.println("\n Desea seguir? " 
					+ "\nSi = 1 "
					+ "\nNo = 2");
			int opcion = teclado.nextInt();
			if(opcion == 1){
				seguir = true;
			}
			else if(opcion == 2){
				seguir = false;
			}
			else{
				System.out.println("Ingreso la opccion incorrecta");
			}
		}
		
	}
	
	
	
	public void eliminarProducto(){
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese el articulo que quiere eliminar: ");
		int articulo = teclado.nextInt();
		
		if(articulo == this.primero.articulo) {
			this.primero = this.primero.siguiente;
		}
		else{
			Producto viejo = this.primero;
			Producto actual = this.primero;
			while(viejo.articulo != articulo) {
				actual = viejo;
				viejo = viejo.siguiente;
			}			 
			actual.siguiente = viejo.siguiente;
		}
			
	}
	
	public void mostrarProductos(){
		Producto nodito = this.primero;
		if(this.primero == null){
			System.out.println("No hay nada registado.");
		}
		else{
			while(nodito != null) {
				nodito.mostrar();
				nodito = nodito.siguiente;
			}
		}
	}
		
	
	
	
}

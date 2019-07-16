package Registradora;
import java.util.Scanner;

public class Registradora {
	
	ListaTDA mercaderias = new ListaTDA();
	
	public Registradora(){
		
	}
	
	public void menu(){
		boolean seguir = true;
		opcionesMenu();
		Scanner teclado = new Scanner(System.in);

		int opcion = teclado.nextInt();
		while(seguir){
			if(opcion == 1){
				mercaderias.agregarProducto();
			}
			else if(opcion == 2){
				mercaderias.eliminarProducto();
			}
			else if(opcion == 3){
				mercaderias.mostrarProductos();
			}
			
			else if(opcion == 0){
				seguir = false;
				System.out.print(" Bye bye");
				break;
			}
			else{
				System.out.println("\n Opcion inválida");
				System.out.println(" Ingrese nuevamente");
			}
			System.out.print(" Opcion = ");
			opcion = teclado.nextInt();
		}
	}
	
	

	
	public void opcionesMenu(){
		System.out.print("---------- Bienvenido/a a la caja registradora ----------\n" +
		"    ----- Ingrese La opccion que quiera realizar -----\n" + 
		" 1 = Registrar Producto\n" +
		" 2 = Eliminar Producto\n" +
		" 3 = Mostrar Productos\n" +
		" 0 = Salir\n" +
		" Opccion = ");
		
	}
	
}

package Arbol;

public class Principal {
	public static void main (String [] args) {
		Arbol arbolito = new Arbol();
		arbolito.agregarDato(50);
		arbolito.agregarDato(40);
		arbolito.agregarDato(11);
		arbolito.agregarDato(10);
		arbolito.agregarDato(65);
		arbolito.agregarDato(66);
		arbolito.agregarDato(67);
		arbolito.agregarDato(70);
		arbolito.agregarDato(69);
//		System.out.print(arbolito.sumaDeDatos());
		
//		System.out.print(arbolito.pesoArbol());
//		arbolito.eliminar(10);
//		arbolito.inOrden();
//		System.out.print(arbolito.gradoDeUnNodo(50));
//		System.out.print(arbolito.profundidadDeUnNodo(50));
//		System.out.print(arbolito.profundidadDelArbol(0,0));
//		arbolito.recorrerMostrandoNivel();
		System.out.println(arbolito.alturaMaxima());
		
//		arbolito.inOrden();
	}
	
	
	
}
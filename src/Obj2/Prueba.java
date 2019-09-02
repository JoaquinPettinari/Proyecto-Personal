package Obj2;
import java.util.Scanner;

public class Prueba {
	public static void main(String [] args){
//		tomarNumeros();
		numerosMayores();
	}
	
	
	
	public static void tomarNumeros(){
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese 10 numeros ");
		int [] lista = new int [10];
		
		for(int i = 0; i < 10; i++){
			System.out.println("Ingrese un numero: ");
			lista[i] = leer.nextInt();
		}
		for(int j = 9; j >= 0; j--){
			System.out.println(lista[j]);
		}
	}
	
	public static void numerosMayores(){
		Scanner leer = new Scanner(System.in);
		System.out.println("Digitame un numero minimo: ");
		
		int numero = leer.nextInt();
		int contador = 0;
		int [] listaDe20 = new int [7];
		
		for(int i = 0; i < listaDe20.length ; i++){
			System.out.print("Digitame un numero: ");
			int numQueEntra = leer.nextInt();
			if(numQueEntra > numero){
				listaDe20[contador] = numQueEntra;
				contador++;
			}
		}
		
		
		
		for(int j = 0; j < 7; j++){
			System.out.println(listaDe20[j]);
		}
	}
	
	
	
}

package Obj2;
import java.util.Scanner;

public class Parte1{
	public static void main (String [] args){
//		------- Ejercicio 1 -------
//		darVueltaUnaLista();
//		------- Ejercicio 2 -------
//		mayoresAUnNumero();
//		------- Ejercicio 3 -------
//		temperaturas();
//		------- Ejercicio 4 -------
		
	}
//	------- Ejercicio 1 -------
	public static void darVueltaUnaLista(){
		Scanner leer = new Scanner(System.in);
		int [] vector = new int [10];
		for(int i = 0; i < 10; i++){
			System.out.print("Ingrese un valor: \n");
			vector[i] = leer.nextInt();
		}
		for(int j = 9; j >= 0; j--){
			System.out.print(vector[j] + " \t");
		}
	}
//	------- Ejercicio 2 -------
	public static void mayoresAUnNumero(){
		Scanner leer = new Scanner(System.in);
		int [] vector = {90,10,80,20,70,30,60,40,50};
		System.out.print("Ingrese un número para determinar los mayores a el: ");
		int numero = leer.nextInt();
		for(int i = 0; i < vector.length ; i++){
			if(numero <= vector[i]){
				System.out.print(vector[i] + "\t" );
			}
		}
	}
//	------- Ejercicio 3 -------
	public static void temperaturas(){
		Scanner leer = new Scanner(System.in);
		float media = 0; float menor = 10000000; float mayor = 0;
		System.out.println("Ingrese cantidad de dias para registrar temperatura: ");
		int dias = leer.nextInt();
		int dia = 1;
		float [] diasTemperatura = new float [dias];
		for(int i = 0; i < diasTemperatura.length; i++){
			System.out.print("Ingrese temperatura del " + dia + ": " );
			float actual = leer.nextFloat();
			diasTemperatura[i] = actual;
			if(actual >= mayor){
				mayor = actual;
			}
			if(actual <= menor){
				menor = actual;
			}
			media += actual;
			dia++;
		}
		System.out.println("Temperatura mas baja = " + menor);
		System.out.println("Temperatura promedio = " + media / dias);
		System.out.println("Temperatura mas alta = " + mayor);
		
		
	}
	
		
		
		
		
	
	
	
}
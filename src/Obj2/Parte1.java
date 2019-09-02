package Obj2;
import java.util.Scanner;
import java.util.Random; 

public class Parte1{
	public static void main (String [] args){
//		------- Ejercicio 1 -------
//		darVueltaUnaLista();
		
//		------- Ejercicio 2 -------
		mayoresAUnNumero();
		
//		------- Ejercicio 3 -------
//		temperaturas();
		
//		------- Ejercicio 4 -------
//		nombresEspecificos();
		
//		------- Ejercicio 5 -------
//		contarLetras();
		
//		------- Ejercicio 6 -------
//		matriz();
		
		
//		------- Ejercicio 7 -------
//		matriz10x10();

		
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
	
//	------- Ejercicio 4 -------
	public static void nombresEspecificos(){
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de alumnos que va a ingresar: ");
		int cantidadAlumnos = leer.nextInt();
		String [] nombres = new String[cantidadAlumnos];
		String [] apellidos = new String[cantidadAlumnos];
		char letra;
		String letra2;
		for(int i = 0; i < cantidadAlumnos; i++){
			System.out.println("Ingrese nombre: ");
			nombres[i] = leer.next();
			System.out.println("Ingrese apellido del alumno " + nombres[i]);
			apellidos[i] = leer.next();
		}
		System.out.print("Ingrese la letra de quien buscar: ");
		letra2 = leer.next();
		letra = letra2.charAt(0);
		
		for(int j = 0; j < cantidadAlumnos; j++){
			if(nombres[j].charAt(0) == letra){
				System.out.println(nombres[j] + " " + apellidos[j]);
			}
		}
		System.out.print("Fin");
	}
		
//	------- Ejercicio 5 -------
	public static void contarLetras(){
		Scanner leer = new Scanner(System.in);
		String cadena = "";
		char [] caracteres;
		char caracter;
		int contador = 0;
		System.out.println("Escribi una frase: ");
		cadena = leer.nextLine();
		caracteres = cadena.toCharArray();
		for(int i = 0; i < caracteres.length; i++){
			caracter = caracteres[i];
			for(int j = 0; j < caracteres.length; j++){
				if(caracteres[j] == caracter){
					contador++;
				}
			}
			System.out.println(caracteres[i] + " " + contador);
			contador = 0;
		}
	}

//	------- Ejercicio 6 -------
	public static void matriz(){
		Scanner leer = new Scanner(System.in);
		int [][] matriz = new int[3][3];
		System.out.println("Ingrese los datos de la matriz ");
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz.length; j++){
				System.out.print("Ingrese dato posicion ["+ i+ "]" + "[" + j + "] : " );
				matriz[i][j] = leer.nextInt();
			}
			System.out.println("");
		}
		mostrarMatriz(matriz);
		
		
	}
	public static void mostrarMatriz(int [][] matriz){
		
		for (int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz.length; j++){
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
			System.out.println();
		}
	}
	
//	------- Ejercicio 7 -------
	public static void matriz10x10() {
		Scanner leer = new Scanner(System.in);
		int [][] matriz = new int [10][10];
		Random r = new Random();
		System.out.println("Matriz: ");
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz.length; j++){
				int aleatorio = r.nextInt(100);
				matriz[i][j] = aleatorio;
			}
		}
		mostrarMatriz(matriz);
	}

	
		
		
	
	
	
}
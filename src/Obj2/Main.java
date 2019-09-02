package Obj2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Empleado [] empleados = new Empleado[20]; 
        boolean seguir = true;
        System.out.println("Buenass... aquí se registran empleados");
        int cantidad = 0;   

        while(seguir){
            System.out.println("Ingrese una opcion: ");
            System.out.println("1- Agregar empleado. ");
            System.out.println("2- Mostrar empleados. ");

            int opcion = leer.nextInt();
            if(opcion == 1){
            	System.out.println("1- Si es Administrativo");
            	System.out.println("2- Si es Vendedor");
            	int tipoEmpleado = leer.nextInt();
            	if(tipoEmpleado == 1){
                	empleados[cantidad] = agregarAdministrativo();
                }
                else if (tipoEmpleado == 2){
                	empleados[cantidad] = agregarVendedor();
                }
                else{
                	System.out.println("Ingresó mal el numero");
                }
            	cantidad++;
            }
            else if(opcion == 2){
            	
            }

        }



    }


    public static Administrativo agregarAdministrativo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Nombre: ");
        String nombre = leer.next();
        System.out.println("Ingrese Apellido: ");
        String apellido = leer.next();
        System.out.println("Ingrese DNI: ");
        int dni = leer.nextInt();
        System.out.println("Ingrese email: ");
        String email = leer.next();
        System.out.println("Ingrese sueldo base: ");
        int sueldoBase = leer.nextInt();
        System.out.println("Ingrese las horas extra: ");
        int horasExtra = leer.nextInt();
        System.out.println("Ingrese las horas mes: ");
        int horasMes = leer.nextInt();
        Administrativo a1 = new Administrativo(dni, nombre, apellido, email, sueldoBase, horasExtra, horasMes);
        return a1;
    }
    
    public static Vendedor agregarVendedor(){
    	Scanner leer = new Scanner(System.in);
    	System.out.println("Ingrese Nombre: ");
    	String nombre = leer.next();
    	System.out.println("Ingrese Apellido: ");
    	String apellido = leer.next();
    	System.out.println("Ingrese DNI: ");
    	int dni = leer.nextInt();
    	System.out.println("Ingrese email: ");
    	String email = leer.nextLine();
    	System.out.println("Ingrese sueldo base: ");
    	int sueldoBase = leer.nextInt();
    	System.out.println("Ingrese el porcentaje de comision: ");
    	int porcentajeComision = leer.nextInt();
    	System.out.println("Ingrese las horas mes: ");
    	int totalVentas = leer.nextInt();
    	Vendedor a2 = new Vendedor(dni, nombre, apellido, email, sueldoBase, porcentajeComision, totalVentas);
    	return a2;
    }

}

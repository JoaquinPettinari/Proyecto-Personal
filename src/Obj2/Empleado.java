package Obj2;

public class Empleado {
    protected String nombre;
    protected String apellido;
    protected int dni;
    protected String email;
    protected int sueldoBase;

    public Empleado(int dni, String nombre, String apellido, String email, int sueldoBase) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.sueldoBase = sueldoBase;
    }


}


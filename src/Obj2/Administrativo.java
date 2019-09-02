package Obj2;

public class Administrativo extends Empleado{
    int horasExtra;
    int horasMes;

    public Administrativo(int dni, String nombre, String apellido, String email, int sueldoBase, int horasExtra, int horasMes) {
        super(dni, nombre, apellido, email, sueldoBase);
        this.horasExtra = horasExtra;
        this.horasMes = horasMes;
    }
}


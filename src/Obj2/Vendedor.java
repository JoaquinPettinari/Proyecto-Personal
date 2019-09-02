package Obj2;

public class Vendedor extends Empleado{
    int porcentajeComision;
    int totalVentas;

    public Vendedor(int dni, String nombre, String apellido, String email, int sueldoBase, int porcentajeComision, int totalVentas) {
        super(dni, nombre, apellido, email, sueldoBase);
        this.porcentajeComision = porcentajeComision;
        this.totalVentas = totalVentas;
    }
}

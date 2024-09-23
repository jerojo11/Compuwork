// Clase Empleado

import java.util.Date;

class Empleado extends Persona {
    private Date fechaContratacion;
    private double salarioBase;

    public Empleado(int id, String nombre, String apellido, Date fechaContratacion, double salarioBase) {
        super(id, nombre, apellido);
        this.fechaContratacion = fechaContratacion;
        this.salarioBase = salarioBase;
    }

    public Date getFechaContratacion() { return fechaContratacion; }
    public double getSalarioBase() { return salarioBase; }
    public void setSalarioBase(double salario) { this.salarioBase = salario; }
    public double calcularSalario() { return salarioBase; }
}
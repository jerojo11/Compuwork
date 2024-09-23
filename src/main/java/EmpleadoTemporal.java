// Clase EmpleadoTemporal

import java.util.Date;

class EmpleadoTemporal extends Empleado {
    private Date fechaFinContrato;

    public EmpleadoTemporal(int id, String nombre, String apellido, Date fechaContratacion, double salarioBase, Date fechaFinContrato) {
        super(id, nombre, apellido, fechaContratacion, salarioBase);
        this.fechaFinContrato = fechaFinContrato;
    }

    public Date getFechaFinContrato() { return fechaFinContrato; }
    public void setFechaFinContrato(Date fecha) { this.fechaFinContrato = fecha; }
    public void extenderContrato(int dias) {
        // Implementar lógica para extender el contrato
    }

    @Override
    public double calcularSalario() {
        // Implementar lógica específica para empleados temporales
        return getSalarioBase();
    }
}

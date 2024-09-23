
// Clase EmpleadoPermanente

import java.util.Date;

class EmpleadoPermanente extends Empleado {
    private int anosAntiguedad;
    private double bonusAnual;

    public EmpleadoPermanente(int id, String nombre, String apellido, Date fechaContratacion, double salarioBase, int anosAntiguedad, double bonusAnual) {
        super(id, nombre, apellido, fechaContratacion, salarioBase);
        this.anosAntiguedad = anosAntiguedad;
        this.bonusAnual = bonusAnual;
    }

    public int getAnosAntiguedad() { return anosAntiguedad; }
    public double getBonusAnual() { return bonusAnual; }
    public void setBonusAnual(double bonus) { this.bonusAnual = bonus; }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonusAnual;
    }
}


// Clase ReporteDesempeno

import java.util.Date;

class ReporteDesempeno {
    private Empleado empleado;
    private Date fechaEvaluacion;
    private int puntuacion;

    public ReporteDesempeno(Empleado empleado, Date fechaEvaluacion, int puntuacion) {
        this.empleado = empleado;
        this.fechaEvaluacion = fechaEvaluacion;
        this.puntuacion = puntuacion;
    }

    public Empleado getEmpleado() { return empleado; }
    public Date getFechaEvaluacion() { return fechaEvaluacion; }
    public int getPuntuacion() { return puntuacion; }
    public void setPuntuacion(int puntuacion) { this.puntuacion = puntuacion; }

    public String generarReporte() {
        // Implementar lógica para generar el reporte
        return "Reporte de desempeño para " + empleado.getNombre() + " " + empleado.getApellido();
    }
}

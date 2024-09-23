// Clase SistemaGestion

import java.util.ArrayList;
import java.util.List;

class SistemaGestion {
    private List<Empleado> empleados;
    private List<Departamento> departamentos;
    private List<ReporteDesempeno> reportes;

    public SistemaGestion() {
        empleados = new ArrayList<>();
        departamentos = new ArrayList<>();
        reportes = new ArrayList<>();
    }

    public void crearEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void actualizarEmpleado(Empleado empleado) {
        // Implementar lógica para actualizar empleado
    }

    public void eliminarEmpleado(int id) {
        empleados.removeIf(e -> e.getId() == id);
    }

    public void crearDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public ReporteDesempeno generarReporteIndividual(int empleadoId) {
        // Implementar lógica para generar reporte individual
        return null;
    }

    public String generarReporteDepartamental(String string) {
        // Implementar lógica para generar reporte departamental
        return "Reporte departamental";
    }
}
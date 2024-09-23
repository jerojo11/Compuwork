// Clase Departamento

import java.util.ArrayList;
import java.util.List;

class Departamento {
    private String nombre;
    private Empleado jefe;
    private List<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Empleado getJefe() { return jefe; }
    public void setJefe(Empleado jefe) { this.jefe = jefe; }
    public void agregarEmpleado(Empleado empleado) { empleados.add(empleado); }
    public void removerEmpleado(Empleado empleado) { empleados.remove(empleado); }
    public List<Empleado> listarEmpleados() { return new ArrayList<>(empleados); }
}

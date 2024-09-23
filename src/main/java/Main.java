// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;


public class Main {
  public static void main(String[] args) {
    SistemaGestion sistema = new SistemaGestion();
    Empleado empleado = new Empleado(1, "Juan", "Perez", null, 0); // Crea un objeto Empleado
    sistema.crearEmpleado(empleado);
    System.out.println("Se creó un empleado con ID: " + empleado.getId()); // Imprime en pantalla
    
  } 
}
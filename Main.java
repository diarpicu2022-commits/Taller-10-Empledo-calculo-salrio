public class Main {
    public static void main(String[] args) {
        // Crear un empleado por horas
        EmpleHoras empleadoHoras = new EmpleHoras("Juan Pérez", 2000000.0, "Ventas", 40, 16000.0);
        System.out.println("Empleado por horas: " + empleadoHoras.getNombre());
        System.out.println("Departamento: " + empleadoHoras.getDepartamento());
        System.out.println("Salario calculado: " + empleadoHoras.calcularSalario());

        // Crear un empleado a tiempo completo
        EmpleTiempoCom empleadoTiempoCom = new EmpleTiempoCom("María Gómez", 2000000.0, "Marketing", 500000.0);
        System.out.println("\nEmpleado a tiempo completo: " + empleadoTiempoCom.getNombre());
        System.out.println("Departamento: " + empleadoTiempoCom.getDepartamento());
        System.out.println("Salario calculado: " + empleadoTiempoCom.calcularSalario());
    }
}

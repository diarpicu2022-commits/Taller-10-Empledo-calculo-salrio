public class EmpleHoras extends Empleado {
    // Atributos específicos para empleados por horas
    private int horasTrabajadas;
    private double tarifaHora;

    // Constructor por defecto
    public EmpleHoras() {
        super();
        this.horasTrabajadas = 0;
        this.tarifaHora = 0.0;
    }

    // Constructor con parámetros
    public EmpleHoras(String nombre, double salarioBase, String departamento, int horasTrabajadas, double tarifaHora) {
        this.setNombre(nombre);
        this.salarioBase = salarioBase;
        this.setDepartamento(departamento);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

// getters y setters para los atributos específicos
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    // Implementación del método abstracto para calcular el salario
    @Override
    public double calcularSalario() {
        return salarioBase + (horasTrabajadas * tarifaHora);
    }

    // Sobrescribir el método toString para mostrar la información del empleado por horas
    @Override
    public String toString() {
        return "Empleado por horas: " + getNombre() + ", Departamento: " + getDepartamento() + ", Salario calculado: " + calcularSalario();
    }
    
}

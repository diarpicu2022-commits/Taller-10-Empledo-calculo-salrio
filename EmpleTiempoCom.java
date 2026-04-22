public class EmpleTiempoCom extends Empleado {
    // Atributo específico para empleados a tiempo completo
    private double bonofijo;

// Constructor por defecto
public EmpleTiempoCom() {
    super();
    this.bonofijo = 0.0;
}

// Constructor con parámetros
    public EmpleTiempoCom(String nombre, double salarioBase, String departamento, double bonofijo) {
        this.setNombre(nombre);
        this.salarioBase = salarioBase;
        this.setDepartamento(departamento);
        this.bonofijo = bonofijo;
    }
// getters y setters para el atributo específico

    public double getBonofijo() {
        return bonofijo;
    }

    public void setBonofijo(double bonofijo) {
        this.bonofijo = bonofijo;
    }

    // Implementación del método abstracto para calcular el salario
    @Override
    public double calcularSalario() {
        return salarioBase + bonofijo;
    }
    

}

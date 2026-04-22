// Clase abstracta Empleado
public abstract class Empleado {
// Atributos para los empleados
    private String nombre;
    protected double salarioBase;
    private String departamento;

    // getters y setters para los atributos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
// metodo abstracto para calcular el salario
    public abstract double calcularSalario();

}
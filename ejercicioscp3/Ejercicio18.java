package ejercicioscp3;

public class Ejercicio18 {
	private int codigo;
    private String nombres;
    private double horasTrabajadas;
    private double valorHora;
    private double retencion;
    
    public Ejercicio18(int codigo, String nombres, double horasTrabajadas, double valorHora, double retencion) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.retencion = retencion;
    }
    public double calcularSalarioBruto() {
        return horasTrabajadas * valorHora;
    }
    
    public double calcularSalarioNeto() {
        double salarioBruto = calcularSalarioBruto();
        return salarioBruto - (salarioBruto * retencion / 100);
    }
    
    public void mostrarInformacion() {
        System.out.println("Código del empleado: " + codigo);
        System.out.println("Nombres: " + nombres);
        System.out.println("Salario bruto: $" + calcularSalarioBruto());
        System.out.println("Salario neto: $" + calcularSalarioNeto());
    }
    
    public static void main(String[] args) {
        // Ejemplo.
        Ejercicio18 empleado = new Ejercicio18(123, "Juan Pérez", 160, 10, 10);
        empleado.mostrarInformacion();
    }


}
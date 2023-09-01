package ayudantia2;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = new ArrayList<>();

        Empleado empleadoAsalariado = new EmpleadoAsalariado("Carlos Navarro", 750000);
        Empleado empleadoPorHoras = new EmpleadoPorHoras("Miriam Carrillo", 35000, 40);

        listaEmpleados.add(empleadoAsalariado);
        listaEmpleados.add(empleadoPorHoras);

        for (Empleado empleado : listaEmpleados) {
            System.out.println("Nombre: " + empleado.nombre);
            System.out.println("Salario: $" + empleado.calcularSalario());
            System.out.println();
        }
    }
}
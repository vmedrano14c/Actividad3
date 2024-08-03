package ejercicioscp3;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la longitud del lado del triángulo equilátero: ");
        double lado = scanner.nextDouble();

        // Cálculo del perímetro
        double perimetro = 3 * lado;

        // Cálculo de la altura
        double altura = (Math.sqrt(3) / 2) * lado;

        // Cálculo del área
        double area = (Math.sqrt(3) / 4) * Math.pow(lado, 2);

        System.out.println("Perímetro: " + perimetro);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);

        scanner.close();
    }
}


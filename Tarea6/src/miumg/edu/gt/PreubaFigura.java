package miumg.edu.gt;
import java.util.Scanner;

public class PreubaFigura {
    public static void main(String[] args)
    {
        String colorDelCuadrado;
        double ladoDelCuadrado;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el color del cuadrado: ");
        colorDelCuadrado = sc.nextLine();

        System.out.print("Ingrese el lado del cuadrado: ");
        ladoDelCuadrado = sc.nextDouble();

        Cuadrado cube1 = new Cuadrado(colorDelCuadrado, ladoDelCuadrado);

        System.out.printf("El área del cuadrado %s es: %f", cube1.getColor(), cube1.calcularArea());
    }
}


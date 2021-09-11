package miumg.edu.gt;
import java.util.Scanner;

public class Test {
    public static void main (String [] args){
Scanner sc = new Scanner (System.in);

String nombre;
String carne;
int iD;
int edad;
Double precio;

System.out.println("Ingrese el nombre del Alumno/Producto:");
nombre = sc.nextLine();

System.out.println("Ingrese el carnet:");
carne = sc.nextLine();

System.out.println("Ingrese el ID:");
iD = sc.nextInt();

System.out.println("Ingrese el precio del producto:");
precio = sc.nextDouble();

System.out.println("Ingrese la edad:");
edad = sc.nextInt();

Alumno a = new Alumno( nombre, carne, edad);
Producto p = new Producto (iD,nombre, precio);


    }
}

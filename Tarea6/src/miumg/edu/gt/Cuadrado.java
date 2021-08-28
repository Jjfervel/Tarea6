package miumg.edu.gt;

public class Cuadrado extends Figuras{
    private double lado;
    public Cuadrado (String color, double lado)
    {
        super(color);
        this.lado = lado;
    }
    public double calcularArea()
    {
        return lado * lado;
    }
}

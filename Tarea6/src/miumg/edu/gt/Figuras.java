package miumg.edu.gt;

public abstract class Figuras {
    private String color;
    public Figuras(String color)
    {
        this.color = color;
    }

    public abstract double calcularArea();

    public String getColor()
    {
        return color;
    }
}




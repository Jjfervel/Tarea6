package miumg.edu.gt;

import java.lang.constant.ConstantDesc;

public class Producto implements Comparador {
    int iD  ;
    String nombrep;
    Double precio;

    public Producto(int iD, String nombrep, Double precio) {
        this.iD = iD;
        nombrep = nombrep;
        this.precio = precio;
    }

    public int getID() {
        return iD;
    }

    public void setID(int ID) {
        this.iD = iD;
    }

    public String getNombre() {
        return nombrep;
    }

    public void setNombre(String nombrep) {
        nombrep = nombrep;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }


    @Override
    public boolean igualQue(Object q) {
       Producto p = (Producto) q;
       return this.precio == p.precio;
    }

    @Override
    public boolean menorQue(Object q) {
        Producto p = (Producto) q;
        return this.precio == p.precio;
    }

    @Override
    public boolean menorIgualQue(Object q) {
        Producto p = (Producto) q;
        return this.precio == p.precio;
    }

    @Override
    public boolean mayorQue(Object q) {
        Producto p = (Producto) q;
        return this.precio == p.precio;
    }

    @Override
    public boolean mayorIgualQue(Object q) {
        Producto p = (Producto) q;
        return this.precio == p.precio;
    }
}


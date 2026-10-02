package com.example.arquitectura;

public class Cuadrado extends Figura{
    private float lado;

    public Cuadrado(Float lado){
        this.lado = lado;
    }

    @Override
    public float calcularPerimetro(){
        float perimetro;
        perimetro = lado * 4;
        return perimetro;
    }

    @Override
    public float calcularArea(){
        float area;
        area = lado * lado;
        return area;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
}

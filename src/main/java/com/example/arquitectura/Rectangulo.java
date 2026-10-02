package com.example.arquitectura;

public class Rectangulo extends Figura{
    private float base;
    private float altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float calcularPerimetro() {
        float perimetro = (base * 2) + (altura * 2);
        return perimetro;
    }

    @Override
    public float calcularArea() {
        float area = base * altura;
        return area;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}

package com.example.arquitectura;

public class TrianguloRectangulo extends Figura{
    private float base;
    private float altura;
    private float ladoTriangulo;

    public TrianguloRectangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    public void calcularLadoTriangulo(){
        float mitadBase = base/2;
        ladoTriangulo = (float) Math.sqrt(mitadBase * mitadBase + altura * altura);
    }

    @Override
    public float calcularPerimetro(){
        float perimetro = (ladoTriangulo * ladoTriangulo) + base;
        return perimetro;
    }

    @Override
    public float calcularArea(){
        float area = (base * altura) / 2;
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

    public float getLadoTriangulo() {
        return ladoTriangulo;
    }

    public void setLadoTriangulo(float ladoTriangulo) {
        this.ladoTriangulo = ladoTriangulo;
    }
}

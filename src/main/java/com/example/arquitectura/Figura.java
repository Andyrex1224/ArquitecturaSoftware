package com.example.arquitectura;

public abstract class Figura{
    private String nombreFigura;
    private float areaFigura;
    private float perimetroFigura;

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public float getAreaFigura() {
        return areaFigura;
    }

    public void setAreaFigura(float areaFigura) {
        this.areaFigura = areaFigura;
    }

    public float getPerimetroFigura() {
        return perimetroFigura;
    }

    public void setPerimetroFigura(float perimetroFigura) {
        this.perimetroFigura = perimetroFigura;
    }

    public abstract float calcularPerimetro();
    public abstract float calcularArea();


}

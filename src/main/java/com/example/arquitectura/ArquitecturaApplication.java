package com.example.arquitectura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArquitecturaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArquitecturaApplication.class, args);

        Cuadrado cuadrado = new Cuadrado(5f);

        Rectangulo rectangulo = new Rectangulo(10f, 4f);

        TrianguloRectangulo triangulo = new TrianguloRectangulo(6f, 4f);

        triangulo.calcularLadoTriangulo();


        System.out.println("----- CUADRADO -----");
        System.out.println("Lado: " + cuadrado.getLado());
        System.out.println("Area: " + cuadrado.calcularArea());
        System.out.println("Perimetro: " + cuadrado.calcularPerimetro());


        System.out.println("\n----- RECTANGULO -----");
        System.out.println("Base: " + rectangulo.getBase());
        System.out.println("Altura: " + rectangulo.getAltura());
        System.out.println("Area: " + rectangulo.calcularArea());
        System.out.println("Perimetro: " + rectangulo.calcularPerimetro());


        System.out.println("\n----- TRIANGULO -----");
        System.out.println("Base: " + triangulo.getBase());
        System.out.println("Altura: " + triangulo.getAltura());
        System.out.println("Lado: " + triangulo.getLadoTriangulo());
        System.out.println("Area: " + triangulo.calcularArea());
        System.out.println("Perimetro: " + triangulo.calcularPerimetro());
	}

}

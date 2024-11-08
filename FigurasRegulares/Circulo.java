package FigurasRegulares;

public class Circulo {
    double pi = 3.15;
    private double radio;

    // Constructor con parámetros
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Getters y Setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Metodo para calcular el área
    public double AreaCirculo() {
        return (pi * (radio * radio));
    }

    // Metodo para calcular el perímetro
    public double PerimetroCirculo() {
        return (pi*(radio*2));
    }

    // Metodo para imprimir información
    public void ImprimirCirculo() {
        System.out.println("Datos del circulo:" );
        System.out.println("El radio del circulo es igual a: " + getRadio());
        System.out.println("Área: " + AreaCirculo());
        System.out.println("Perímetro: " + PerimetroCirculo());
    }
}

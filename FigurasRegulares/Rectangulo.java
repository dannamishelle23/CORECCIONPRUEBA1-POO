package FigurasRegulares;

public class Rectangulo {
    private double base;
    private double altura;

    //Constructor con parametros
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Getters y Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Metodos perzonalizados
    public double Area (){
        return base * altura;
    }

    public double Perimetro(){
        return 2 * (base + altura);
    }

    public void ImprimirRect() {
        System.out.println("Datos del rectángulo:");
        System.out.println("Ancho: " + getBase() + ", Altura: " + getAltura());
        System.out.println("Área: " + Area());
        System.out.println("Perímetro: " + Perimetro());
    }

}

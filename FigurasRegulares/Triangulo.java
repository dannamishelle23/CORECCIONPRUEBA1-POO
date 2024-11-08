package FigurasRegulares;

public class Triangulo {
    private double ladot;

    public Triangulo(double ladot) {
            this.ladot=ladot;
        }
         //Getter y setter
        public double getTriangulo(){
            return ladot;
        }

    public void setLadot(double ladot) {
        this.ladot = ladot;
    }

    // Metodo para calcular el área
    public double AreaTriangulo() {
        return (ladot * ladot) / 2; // Área = (base * altura) / 2
    }

    // Metodo para calcular el perímetro
    public double PerimetroTriangulo() {
        return ladot * 3; //Se asume que todos los lados son iguales en un triángulo equilátero
    }

    public void ImprimirTriangulo() {
        System.out.println("Datos del triángulo:");
        System.out.println("Lado: " + getTriangulo());
        System.out.println("Área: " + AreaTriangulo());
        System.out.println("Perímetro: " + PerimetroTriangulo());
    }
}


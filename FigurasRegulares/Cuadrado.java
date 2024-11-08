package FigurasRegulares;

public class Cuadrado {
        private double lado;

        //Constructor con parametros
        public Cuadrado(double lado) {
            this.lado = lado;
        }

        //Getters y Setters
        public double getLadoCuadrado() {
            return lado;
        }
        public void setLadoCuadrado(double lado) {
            this.lado = lado;
        }

        //Metodo perzonalizado para calcular el area
        public double AreaCuadrado(){
            return lado * lado;
        }

        //Metodo personalizado para calcular el perimetro
        public double PerimetroCuadrado(){
            return lado * 4;
        }

        public void ImprimirCuadrado(){
            System.out.println("Datos del cuadrado:");
            System.out.println("Lado: " + getLadoCuadrado());
            System.out.println("Área: " + AreaCuadrado());
            System.out.println("Perímetro: " + PerimetroCuadrado());
        }
}

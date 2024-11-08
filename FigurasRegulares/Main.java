package FigurasRegulares;
import java.util.Scanner;
public class Main {
    //Método que calcula la suma de las áreas
    public static double calcularSumaAreas(Cuadrado cuadrado, Rectangulo rectangulo, Circulo circulo, Triangulo triangulo) {
        return cuadrado.AreaCuadrado() + rectangulo.Area() + circulo.AreaCirculo() + triangulo.AreaTriangulo();
    }

    public static void main(String[] args) {
        double sumaAreas;     //Definir la variable para sumar las areas
        Scanner scanner = new Scanner(System.in);

        //Pedir al usuario que ingrese los datos por teclado
        System.out.print("Ingrese el lado del cuadrado: ");
        double ladocuadrado = scanner.nextDouble();
        System.out.print("Ingrese el ancho del rectángulo: ");
        double anchorectangulo = scanner.nextDouble();
        System.out.print("Ingrese el largo del rectángulo: ");
        double largorectangulo = scanner.nextDouble();
        System.out.print("Ingresa el radio del círculo: ");
        double radiocirculo = scanner.nextDouble();
        System.out.print("Ingresa el lado del triángulo: ");
        double ladotriangulo = scanner.nextDouble();

        //Crear las instancias con las variables ingresadas por el usuario
        Triangulo triangulo1 = new Triangulo(ladotriangulo);  //
        Circulo circulo1 = new Circulo(radiocirculo);
        Cuadrado cuadrado1 = new Cuadrado(ladocuadrado);
        Rectangulo rectangulo1 = new Rectangulo(anchorectangulo, largorectangulo);

        //Imprimir usando los métodos personalizados
        cuadrado1.ImprimirCuadrado();
        rectangulo1.ImprimirRect();
        circulo1.ImprimirCirculo();
        triangulo1.ImprimirTriangulo();

        //Suma de todas las áreas
        sumaAreas = calcularSumaAreas(cuadrado1, rectangulo1, circulo1, triangulo1);
        System.out.println("\nLa suma de las áreas es: " + sumaAreas);

        //Permitir al usuario cambiar los valores usando set
        System.out.print("Ingrese un nuevo valor del lado del cuadrado: ");
        double nuevoLadoC = scanner.nextDouble();
        cuadrado1.setLadoCuadrado(nuevoLadoC);

        System.out.print("Ingrese un nuevo radio para el círculo: ");
        double nuevoRadio = scanner.nextDouble();
        circulo1.setRadio(nuevoRadio);

        /*System.out.print("Ingrese un nuevo lado para el triángulo: ");
        double nuevoLadoT = scanner.nextDouble();
        triangulo.setLadot(nuevoLadoT);

        System.out.print("Ingrese una nueva base para el rectángulo: ");
        double nuevoLadoR = scanner.nextDouble();
        triangulo.setLadot(nuevoLadoR);*/

        //Imprimir nuevamente con los nuevos valores
        cuadrado1.ImprimirCuadrado();
        circulo1.ImprimirCirculo();
        //triangulo.ImprimirTriangulo();
        //rectangulo.ImprimirRect();

        //Suma de todas las áreas
        sumaAreas = calcularSumaAreas(cuadrado1, rectangulo1, circulo1, triangulo1);
        System.out.println("\nLa suma de las áreas es: " + sumaAreas);

        scanner.close();
    }
}


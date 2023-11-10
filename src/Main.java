
public class Main {
    public static void main(String[] args) {

        //CIRCULO

        Circulo c1 = new Circulo();
        c1.ingresarPuntos();
        c1.calcularArea();
        c1.calcularPerimetro();
        c1.imprimirArea("Circulo 1");
        c1.imprimirPerimetro("Circulo 1");


        //TRIANGULO
        Triangulo t1 = new Triangulo();
        t1.ingresarPuntos();
        t1.calcularArea();
        t1.calcularPerimetro();
        t1.imprimirArea("Triangulo 1");
        t1.imprimirPerimetro("Triangulo 1");

    }
}
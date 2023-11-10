import java.util.Scanner;

public class Cuadrado extends Figura{

    public Cuadrado() {
    }

    void ingresarPuntos(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        for (int i=0; i<4;i++) {
            System.out.println("Ingrese la componente X del punto: "+i);
            double x = sc.nextDouble();
            System.out.println("Ingrese la componente Y del punto: "+i);
            double y = sc.nextDouble();
            Punto punto = new Punto(x,y);
            this.listaPuntos.add(punto);
        }

    }

    double calcularPerimetro(){
        Punto p1 = this.listaPuntos.get(0);
        Punto p2 = this.listaPuntos.get(1);

        double l1 = p1.calculoDistancia(p2);

        this.perimetro = l1*4;
        return this.perimetro;
    }

    double calcularArea(){
        Punto p1 = this.listaPuntos.get(0);
        Punto p2 = this.listaPuntos.get(1);

        double l1 = p1.calculoDistancia(p2);

        this.area = Math.pow(l1,2);
        return this.area;
    }


}

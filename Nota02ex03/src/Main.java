import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TipoTriangulo t= new TipoTriangulo();

        System.out.println("Digite os comprimentos dos três lados do triângulo:");

        System.out.print("Lado 1: ");
        t.setLado1(sc.nextInt());
        System.out.print("Lado 2: ");
        t.setLado2(sc.nextInt());
        System.out.print("Lado 3: ");
        t.setLado3(sc.nextInt());

        System.out.println(t.getTipoTriangulo());


    }
}
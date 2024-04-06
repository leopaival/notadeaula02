import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Estoque es = new Estoque();
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual quantidade ATUAL em estoque: ");
        es.setAtual(sc.nextInt());
        System.out.println("Qual quantidade MÁXIMA em estoque: ");
        es.setMax(sc.nextInt());
        System.out.println("Qual quantidade MÍNIMA em estoque: ");
        es.setMin(sc.nextInt());
        es.media();
    }

}
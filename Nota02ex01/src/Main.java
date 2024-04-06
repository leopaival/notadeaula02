import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Macas m = new Macas();
        System.out.println("Digite a quantidade de maçãs: ");
        m.setQuantidade(sc.nextInt());
        m.setPreco();
        System.out.println(m.getQuantidade() + " maçãs saem a R$" + m.getPreco()+" a unidade" + ". Total: R$" + m.total());

    }
}
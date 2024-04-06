public class TipoTriangulo {
    private int lado1;
    private int lado2;
    private int lado3;

    private int TipoTriangulo ;
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public int getTipoTriangulo() {
        if (lado1 == lado2 && lado2 == lado3)

            System.out.println("equilátero");
        else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
            System.out.println("isósceles");
        else
            System.out.println("escaleno");




        return lado1+lado2+lado3;
    }
}

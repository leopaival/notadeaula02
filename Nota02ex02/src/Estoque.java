public class Estoque {
    private int atual, max, min;
    public void setAtual(int atual){this.atual = atual;}
    public void setMax(int max){this.max = max;}
    public void setMin(int min){this.min = min;}
    public int getAtual(){return atual;}
    public int getMax(){return max;}
    public int getMin(){return min;}

    public void media(){
        int m = (max + min)/2;
        if (atual >= m){
            System.out.println("Não efetue compra");
        } else {
            System.out.println("Pode efetuar compra");
        }
    }

}

public class Quadrado extends FormaGeometrica {
    private int lado;
    public Quadrado(int l){
        this.lado=l;
    }
    public void calcularArea(){
        int area= this.lado*this.lado;
        System.out.println("A área do quadrado é: " + area);
    }
}

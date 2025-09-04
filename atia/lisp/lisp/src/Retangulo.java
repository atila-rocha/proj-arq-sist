public class Retangulo extends FormaGeometrica {
    private int base, altura;
    public Retangulo(int b, int a){
        this.base=b;
        this.altura=a;
    }
    public void calcularArea(){
        int area= this.base*this.altura;
        System.out.println("A área do retângulo é: "+ area);
    }
}

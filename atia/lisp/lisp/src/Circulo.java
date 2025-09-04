public class Circulo extends FormaGeometrica{
    private int raio;
    public Circulo(int r){
        this.raio=r;
    }
    public void calcularArea(){
        double area=2*3.14f*raio*raio;
        System.out.println("A area do circulo é: " + area);
    }
}

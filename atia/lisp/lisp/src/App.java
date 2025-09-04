public class App {
    public static void main(String[] args) throws Exception {
        Quadrado q1 = new Quadrado(7);
        Retangulo r1 =  new Retangulo(5, 7);
        FormaGeometrica f1 = (FormaGeometrica) q1;
        
        FormaGeometrica f2 = (FormaGeometrica) r1;
        
        FormaGeometrica f3 = new Quadrado(4);
        FormaGeometrica f4 = new Retangulo(7,3);
        FormaGeometrica f5 = new Circulo(1);
        
        f1.calcularArea();
        f2.calcularArea();
        f3.calcularArea();
        f4.calcularArea();
        f5.calcularArea();
        
    }
}

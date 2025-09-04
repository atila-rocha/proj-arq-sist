public class Estagio implements Pagamento{
    private float bolsa;

    public Estagio(float sal){
        this.bolsa=sal;
    }

    public float getSaldo(){
        return this.bolsa;
    }
}

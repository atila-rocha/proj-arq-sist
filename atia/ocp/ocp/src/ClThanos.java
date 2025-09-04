public class ClThanos implements Pagamento {
    private float salario;
    public ClThanos(float sal){
        this.salario=sal;
    }
    public float getSaldo(){
        return this.salario;
    }
}

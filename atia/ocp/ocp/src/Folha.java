import java.util.ArrayList;
import java.util.List;

public class Folha {
    private float saldo;
    private List<Pagamento> funcionarios;
    
    public Folha(){
        this.saldo=0.0f;
        this.funcionarios=new ArrayList<Pagamento>();
    }
    public void addfuncionario(Pagamento pag){
        this.funcionarios.add(pag);
    }
    public float getSaldo(){
        return this.saldo;
    }

    public float calcular(){
        //return this.saldo+=pag.getSaldo();
        for (Pagamento funcionario : funcionarios) {
            this.saldo+=funcionario.getSaldo();
        }
        return getSaldo();
    }
}

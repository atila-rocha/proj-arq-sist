import java.util.ArrayList;
import java.util.List;
public class TurmaDao {
    
    public List<Aluno> load(){
        List<Aluno> lista= new ArrayList<Aluno>();
        lista.add(new Aluno("Roninison", "1"));
        lista.add(new Aluno("Victor", "2"));
        lista.add(new Aluno("Salomão", "3"));
        lista.add(new Aluno("Maria José", "4"));
        lista.add(new Aluno("Pedro", "5"));
        lista.add(new Aluno("Jurandir", "6"));
        return lista;
    }
    public void save(Aluno a){
        System.out.println("Aluno, "+ a.getNome()+ ", salvo com sucesso.");
    }
    public void update(){}
    public void delete(){}
}

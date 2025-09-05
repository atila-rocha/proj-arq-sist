import java.util.ArrayList;
import java.util.List;

public class Turma {
    
    private List <Aluno> listaAluno;
    private TurmaDao tDao;
    private TurmaView tView;
    public Turma (){
        tDao= new TurmaDao();
        listaAluno=tDao.load();
        tView= new TurmaView();
    }
    public float calcMedia(){
        return 0.0f;
    }

    public List <Aluno> getAlunos(){
        return listaAluno;
    }

    public void imprimeListaChamada(){
        tView.imprimeDados(listaAluno);
    }
    public int getTotalAlunos(){
        int totalAlunos= this.listaAluno.size();
        return totalAlunos;
    }
    
    public Aluno add(Aluno a){
        this.listaAluno.add(a);
        tDao.save(a);
        return null;
    }
    public void updateNomeAluno(Aluno a, String nome){
        tDao.update(a, nome);
    }
    public void delete(Aluno a){
        this.listaAluno.remove(a);
        tDao.delete(a);
    }
    public void imprimeAlunos(){
        tView.MostraDados(listaAluno);
    }
}

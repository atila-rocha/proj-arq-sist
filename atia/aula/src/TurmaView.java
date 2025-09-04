import java.util.List;
public class TurmaView {
    
    public void imprimeDados(Aluno a){
        System.out.println("Nome: "+ a.getNome()+ " Matrícula: "+ a.getMatricula());
    }
    public void imprimeDados(List<Aluno> alunos){
        System.out.println("LISTA DE CHAMADAS \t\t\t PRESENTE");
        for (Aluno a1 : alunos) {
            System.out.println("Nome: "+ a1.getNome()+ ", Matrícula: "+ a1.getMatricula()+"\t\t[ ]");    
        }
        
    }
    public void MostraDados(){
        System.out.println("Mostra na tela dados dos alunos");
    }
}

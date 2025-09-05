public class App {
    public static void main(String[] args) throws Exception {
        Turma t252= new Turma();
        t252.imprimeListaChamada();
        //System.out.println(t252.getTotalAlunos());
        Aluno a1 = new Aluno("Tereza", "123456");
        Aluno a2 = new Aluno("Robert", "234567");
        t252.add(a1);
        t252.imprimeListaChamada();
        t252.delete(a1);
        t252.imprimeAlunos();
        t252.add(a2);
        t252.imprimeAlunos();
        t252.updateNomeAluno(a2, "Roberto");
        t252.imprimeListaChamada();
    }
}



public class App {
    public static void main(String[] args) throws Exception {
        Turma t252= new Turma();
        t252.imprimeListaChamada();
        //System.out.println(t252.getTotalAlunos());
        Aluno a1 = new Aluno("Tereza", "123456");
        t252.add(a1);
        t252.imprimeListaChamada();
    }
}



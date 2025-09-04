public class App {
    public static void main(String[] args) throws Exception {
        Folha f1= new Folha();
        Pagamento c1= new Contrato(2500.0f);
        Pagamento e1 = new Estagio(900.0f);
        Pagamento clt= new ClThanos(1200.0f);
        f1.addfuncionario(clt);
        f1.addfuncionario(e1);
        f1.addfuncionario(c1);
        System.out.println("Saldo atualizado"+" da folha de pagamento: "+f1.calcular());
    }
}

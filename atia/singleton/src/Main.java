//Main.java
public class Main{
    public static void main (String[] args) throws Exception {
        Logger lg= Logger.getInstance();
        lg.println("Vasco");


        Teste1 t1 = new Teste1();
        Teste2 t2 = new Teste2();
        Teste3 t3 = new Teste3();

        t1.escreveLog();
        t2.escreveLog();
        t3.escreveLog();
        
        
        DBConn dbcon = DBConn.getInstance();
        dbcon.conecta();
    }
}
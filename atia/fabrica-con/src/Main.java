//Main.java
public class Main{
    public static void main (String[] args) throws Exception {
        //TCPChannel ch = new TCPChannel();
        Connection oracle = ConnectionFactory.createOracleConn();
        Connection mysql = ConnectionFactory.createMySQLConn();
        Connection pg = ConnectionFactory.createPostgresConn();
        
        oracle.getConnection();
        mysql.getConnection();
        pg.getConnection();

    }
}

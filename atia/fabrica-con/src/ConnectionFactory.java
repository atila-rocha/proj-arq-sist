//ConnectionFactory.java
public class ConnectionFactory{
    public static Connection createOracleConn(){
        return new OracleConnection();
    }
    public static Connection createPostgresConn(){
        return new PostGresConnection();
    }
    public static Connection createMySQLConn(){
        return new MySQLConnection();
    }
    
}
//TCPChannel.java
public class TCPChannel implements Channel{
    public void send(String msg){
        System.out.println("Enviando Mensagem UDP: "+ msg);
    }
    public String receive(){
        return "Nova mensagem";
    }
}

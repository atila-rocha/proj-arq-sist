//UDPChannel.java
public class UDPChannel implements Channel{
    public void send(String msg){
        System.out.println("Enviando Mensagem TCP: "+ msg);
    }
    public String receive(){
        return "Nova mensagem";
    }
}
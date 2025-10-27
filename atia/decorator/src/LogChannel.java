public class LogChannel extends ChannelDecorator{
    public LogChannel(Channel c){
        super(c);
    }

    public void send(String msg){
        String message = "Log de envio de mensagem: " + msg; 
        super.channel.send(message);
    }
    public String receive(){
        
        return "Log de recepção de mensagem: " + super.channel.receive();
    }
}

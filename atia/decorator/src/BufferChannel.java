public class BufferChannel extends ChannelDecorator{
    public BufferChannel(Channel c){
        super(c);
    }

    public void send(String msg){
        String message = "Buffer de envio de mensagem: " + msg; 
        super.channel.send(message);
    }
    public String receive(){
        
        return "Buffer de recepção de mensagem: " + super.channel.receive();
    }
}

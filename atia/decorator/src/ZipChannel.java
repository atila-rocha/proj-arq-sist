public class ZipChannel extends ChannelDecorator{
    public ZipChannel(Channel c){
        super(c);
    }

    public void send(String msg){
        //compacta msg
        String message = "Compactando mensagem: " + msg; 
        super.channel.send(message);
    }
    public String receive(){
        //descompacta msg
        
        return "DesCompactando mensagem: " + super.channel.receive();
    }
}

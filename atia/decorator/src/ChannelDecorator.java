public class ChannelDecorator implements Channel {
    protected Channel channel;
    public ChannelDecorator(Channel channel){
        this.channel=channel;
    }

    public void send(String msg){
        channel.send(msg);
    }

    public String receive(){
        return channel.receive();
    }
}

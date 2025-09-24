public class ChannelFactory{
    public static Channel createTCP(){
        return new TCPChannel();
    }
    public static Channel createUDP(){
        return new UDPChannel();
    }
}
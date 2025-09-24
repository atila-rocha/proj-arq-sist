public class Main{
    public static void main (String[] args) throws Exception {
        //TCPChannel ch = new TCPChannel();

        Channel chtcp = ChannelFactory.createTCP();
        Channel chudp = ChannelFactory.createUDP();
        chtcp.getMessage();
        chudp.getMessage();
        

    }
}

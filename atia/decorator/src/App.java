public class App {
    public static void main(String[] args) throws Exception {
        Channel c1 = new ZipChannel(new TCPChannel());
        Channel c2 = new BufferChannel(new ZipChannel(new TCPChannel()));
        Channel c3 = new LogChannel(new BufferChannel(new ZipChannel(new TCPChannel())));
        c1.send("Hello world");
        System.out.println(c1.receive());
        c2.send("Hello world");
        System.out.println(c1.receive());
        c3.send("Hello world");
        System.out.println(c1.receive());
    }
}

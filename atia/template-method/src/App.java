import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("1", "2"));
        ReportGenerator rp1= new SalesReport(list);
        ReportGenerator rp2= new InventoryReport(list);
        ReportGenerator rp3= new CustomerReport(list);
        rp1.generateReport();
        rp2.generateReport();
        rp3.generateReport();
    }
}

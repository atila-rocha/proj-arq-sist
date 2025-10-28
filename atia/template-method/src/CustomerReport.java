import java.util.ArrayList;
import java.util.List;
//InventoryReport.java
public class CustomerReport extends ReportGenerator{
    private List<String> result;
    public CustomerReport(List<String> info){
        super(info);
    }

    public void loadData(){
        result = new ArrayList<>();
        for (String inform : super.getInfo()) {
            result.add("Cliente: "+inform);
        }
        System.out.println("Informações de vendas carregadas");
    }

    public void sortData(){
        result.sort(null);
        System.out.println("Informacoes de vendas organizadas");
    }

    public void formatData(){
        int count=0;
        for (String line : result) {
            System.out.println("ID: " + count + " | "+ line);
            count++;
        }
    }

}

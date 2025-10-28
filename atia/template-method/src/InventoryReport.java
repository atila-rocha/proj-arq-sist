import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//InventoryReport.java
public class InventoryReport extends ReportGenerator{
    private List<String> result;
    public InventoryReport(List<String> info){
        super(info);
    }

    public void loadData(){
        result = new ArrayList<>();
        for (String inform : super.getInfo()) {
            result.add(inform);
        }
        System.out.println("Informações de vendas carregadas");
    }

    public void sortData(){
        result.sort(Comparator.reverseOrder());
        System.out.println("Informacoes de vendas organizadas");
    }

    public void formatData(){
        int count=result.size();
        for (String line : result) {
            System.out.println("Linha " + count + ": "+ line);
            count--;
        }
    }

}

import java.util.ArrayList;
import java.util.List;
//SalesReport.java
public class SalesReport extends ReportGenerator{
    private List<String> result;
    public SalesReport(List<String> info){
        super(info);
    }

    public void loadData(){
        result = new ArrayList<>();
        result.addAll(super.getInfo()); //
        System.out.println("Informações de vendas carregadas");
    }

    public void sortData(){
        result.sort(null);
        System.out.println("Informacoes de vendas organizadas");
    }

    public void formatData(){
        int count=0;
        for (String line : result) {
            System.out.println("Linha " + count + ": "+ line);
            count++;
        }
    }

}

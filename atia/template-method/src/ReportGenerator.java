import java.util.ArrayList;
import java.util.List;
//ReportGenerator.java
public abstract class ReportGenerator {
    private List <String> info = new ArrayList<>();

    public ReportGenerator(List<String> info){
        this.info.addAll(info);
    }

    public abstract void loadData();
    public abstract void sortData();
    public abstract void formatData();

    public void generateReport(){
        loadData();
        sortData();
        formatData();
    }
    
    public List<String> getInfo(){
        return this.info;
    }

}
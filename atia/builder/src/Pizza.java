// Classe Pizza (produto final)

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String massa;
    private String molho;
    private String queijo;
    private List<String> ingredientes;

    // Construtor privado (só o Builder pode criar)
    Pizza(String massa, String molho, String queijo, List<String> ingredientes) {
        this.massa = massa;
        this.molho = molho;
        this.queijo = queijo;
        this.ingredientes = ingredientes;
    }

    // Builder interno
    
}
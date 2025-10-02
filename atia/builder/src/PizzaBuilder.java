import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder implements Builder<Pizza> {
        private String massa;
        private String molho;
        private String queijo;
        private List<String> ingredientes = new ArrayList<>();

        public PizzaBuilder comMassa(String massa) {
            System.out.println("Adicionando massa: " + massa);
            this.massa = massa;
            return this; // Retorna o próprio Builder (fluent interface)
        }

        public PizzaBuilder comMolho(String molho) {
            System.out.println("Adicionando molho: " + molho);
            this.molho = molho;
            return this;
        }

        public PizzaBuilder comQueijo(String queijo) {
            System.out.println("Adicionando queijo: " + queijo);
            this.queijo = queijo;
            return this;
        }

        public PizzaBuilder adicionarIngrediente(String ingrediente) {
            System.out.println("Adicionando ingrediente: " + ingrediente);
            this.ingredientes.add(ingrediente);
            return this;
        }

        public Pizza build() {
            System.out.println("Criando pizza com: "+ massa + ", "+ molho + ", "+ queijo + ", "+ ingredientes);
            // Validações podem ser adicionadas aqui
            return new Pizza(massa, molho, queijo, ingredientes);
        }
    }
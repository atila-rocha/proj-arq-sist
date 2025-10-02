public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder()
        .comMassa("de pão")
        .comMolho("tomate")
        .comQueijo("mussarella")
        .adicionarIngrediente("carne de sol")
        .build();

    }
}

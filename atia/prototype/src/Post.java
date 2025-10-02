// Nossa classe concreta que pode ser clonada
public class Post implements DocumentPrototype {

    private int largura;
    private int altura;
    private String filtro;

    public Post(int largura, int altura, String filtro) {
        this.largura = largura;
        this.altura = altura;
        this.filtro = filtro;
    }

    // Getter e Setter para o filtro, para podermos modificá-lo depois
    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }

    public void exibirInfo() {
        System.out.println("Post: " + this.largura + "x" + this.altura + ", Filtro: " + this.filtro);
    }

    public DocumentPrototype clonar() {
        System.out.println("Clonando o objeto...");
        try {
            // Isso cria uma cópia "rasa" (shallow copy) do objeto.
            return (Post) super.clone();
        } catch (CloneNotSupportedException e) {
            // Esta exceção não deveria acontecer, pois implementamos Cloneable
            e.printStackTrace();
            return null;
        }
    }
}
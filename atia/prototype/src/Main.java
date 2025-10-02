public class Main {
    public static void main(String[] args) throws Exception {
        Post templateVintage = new Post(1080, 1080, "Sépia");

        templateVintage.exibirInfo();


        //O usuário decide usar este template para criar um novo post
        Post newPost = (Post) templateVintage.clonar();

        newPost.setFiltro("Preto e Branco");


        templateVintage.exibirInfo(); // Continua com filtro "Sépia"

        newPost.exibirInfo(); // Agora tem o filtro "Preto e Branco"
    }
}

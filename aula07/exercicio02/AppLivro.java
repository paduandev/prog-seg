package exercicio02;

public class AppLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();

        livro1.titulo = "Programando em Java";
        livro1.autor = "Deitel";
        livro1.paginas = 200;
        livro1.preco = 150;

        livro1.exibir();
    }
}

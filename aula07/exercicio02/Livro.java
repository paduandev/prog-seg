package exercicio02;

public class Livro {
    // atributos
    String titulo, autor;
    int paginas;
    double preco;

    // métodos
    void exibir() {
        System.out.println(titulo +  " - " + autor + ", páginas: " + paginas + " R$ " + preco);
    }

}

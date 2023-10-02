package metodos;

public class Exemplo02 {
    public static void main(String[] args) {
        linha(10);
        linha(20);
    }

    // método com parâmetros
    // void significa que não retorna resultado
    static void linha(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

}

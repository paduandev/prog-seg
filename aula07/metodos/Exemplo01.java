package metodos;

public class Exemplo01 {

    public static void main(String[] args) {
        exibir();
        System.out.println("Executando instrução no main");
        exibir(); // chamando o método exibir
    }

    // método chamado exibir
    static void exibir() {
        System.out.println("Excutando o método exibir");
    }

}
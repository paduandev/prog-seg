package metodos;

public class Exemplo03 {
    public static void main(String[] args) {
        int resultado;

        resultado = soma(5, 7);
        System.out.println("Soma = " + resultado);
    }

    //método com retorno
    static int soma(int n1, int n2) {
        int resposta;
        resposta = n1 + n2;
        return resposta;
    }
}

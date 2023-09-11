package ternario;

/**
 * Apresentação do operador de decisão (if) ternário
 */
public class Exemplo01 {
    public static void main(String[] args) {
        int numero = -10;
        String resposta;

        // if(numero >= 0) {
        //     resposta = "Número positivo";
        // } else {
        //     resposta = "Número negativo";
        // }

        resposta = (numero >= 0) ? "Número positivo" : "Número negativo";

        System.out.println(resposta);
    }
}
package exemplo2;

/*Atalhos:
 * SHIFT + ALT + SETA BAIXO : duplica linha ou bloco
 * SHIFT + ALT + F : formatar código
 * sout: println : escreve e pula para próxima linha
 */

 // esse é um comentário de linha

public class Exemplo2 {
    public static void main(String[] args) {
        // Operadores aritméticos(matemáticos)
        System.out.println("12 + 10");
        System.out.println(12 + 10 + "texto");
        System.out.println("texto" + 12 + 10 );
        System.out.println("texto" + (12 + 10) );

        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 5);

        // obedece a ordem de precedência ou parênteses
        System.out.println(10 - 4 / 2);
        System.out.println((10 - 4) / 2);
    }
}

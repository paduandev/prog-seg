package exemplo02;

// Contar quantos caracteres maiúsculos existem no texto

public class ExemploString {
    public static void main(String[] args) {
        String texto = "Boa Noite! Como Vai?";
        int count = 0;

        System.out.println(texto);

        for (int i = 0; i < texto.length(); i++) {
           if(Character.isUpperCase(texto.charAt(i))) {
            count++;
           }
        }
        System.out.println("# maiúsculas: " + count);
    }
}

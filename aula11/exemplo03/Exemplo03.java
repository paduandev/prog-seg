package exemplo03;

public class Exemplo03 {
    public static void main(String[] args) {
        
        int valor = -5;

        try {
             validaPositivo(valor);
             System.out.println("Número positivo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    static void validaPositivo(int numero) throws Exception {
        if(numero < 0) {
            throw new Exception("Número negativo");
        }
    }
}

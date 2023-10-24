package exemplo01;

public class App {
    public static void main(String[] args) {
        Pessoa p;
        p = new Pessoa(123, "Daniel");
        Estudante e1 = new Estudante(111, "Carlos", "ADS");

        // System.out.println("Registro: " + p.getRegistro());
        // System.out.println("Pessoa: " + p.getNome());
        // e1.setNome("Carlos");
        // e1.setNomeCurso("ADS");
        System.out.println("Registro: " + e1.getRegistro());
        System.out.println("Estudante: " + e1.getNome());
        System.out.println("Curso: "+ e1.getNomeCurso());

        System.out.println("----");

        System.out.println(p);
        System.out.println(e1);

        // Todo Estudante "É UMA" Pessoa, então pode aplicar Polimorfismo
        Pessoa e2 = new Estudante(222, "Ricardo", "ADM");
        System.out.println(e2); // chama o toString de Estudadente: "Polimorfimo"
    }
}

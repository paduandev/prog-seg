package exemplo01;

public class Estudante extends Pessoa {
    private String nomeCurso;

    public Estudante(int registro, String nome, String nomeCurso) {
        super(registro, nome);
        this.nomeCurso = nomeCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    @Override
    public String toString() {
        return "Estudante: " + getRegistro() + " : " + getNome() + " : " + nomeCurso;
    }
}

public class Estudante extends Participante {

    Estudante(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }

    private String curso;

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public void ImprimeDescricao() {
        System.out.println("Nome: " + this.getNome() + "\nCurso: " + this.curso);
    }
}

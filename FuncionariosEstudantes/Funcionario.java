public class Funcionario extends Participante {

    Funcionario(String nome, String cargo) {
        super(nome);
        this.cargo = cargo;
    }

    private String cargo;

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public void ImprimeDescricao() {
        System.out.println("Nome: " + this.getNome() + "\nCargo: " + this.cargo);
    };

}

public class Mamifero extends Animal {

    private String alimento;

    Mamifero(String nome, String cor, String alimento, int comprimento, double velocidade, int patas) {
        this.setNome(nome);
        this.setCor(cor);
        this.alimento = alimento;
        this.setComprimento(comprimento);
        this.setVelocidade(velocidade);
        this.setPatas(patas);
    }

    void dados() {
        System.out.println("Animal: " + getNome() + "\nComprimento: " + getComprimento() + " cm\nPatas: " + getPatas()
                + "\nCor: " + getCor() + "\nAmbiente: " + getAmbiente() + "\nVelocidade: " + getVelocidade() + " m/s"
                + "\nAlimento: " + alimento);
    }

}

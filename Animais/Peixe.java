public class Peixe extends Animal {
    private String caracteristica;

    Peixe(String nome, String caracteristica, int comprimento, double velocidade) {
        this.setNome(nome);
        this.caracteristica = caracteristica;
        this.setComprimento(comprimento);
        this.setVelocidade(velocidade);
        this.setAmbiente("Mar");
        this.setCor("Cinzento");
        this.setPatas(0);
    }

    void dados() {
        System.out.println("Animal: " + getNome() + "\nComprimento: " + getComprimento() + " cm\nPatas: " + getPatas()
                + "\nCor: " + getCor() + "\nAmbiente: " + getAmbiente() + "\nVelocidade: " + getVelocidade() + " m/s"
                + "\nCaracteristica: " + caracteristica);
    }

}
/*
 * 
 * 
 */
/*
 * 3) Um animal contém um nome, comprimento, número de patas, uma cor, ambiente e uma velocidade (em
m/s). Um peixe é um animal (classe filha de animal), 
tem 0 patas (padrão), o seu ambiente é o mar (padrão),
cor cinzenta (padrão). Além disso, o peixe tem como característica: barbatanas e cauda; 
Um mamífero é um animal (classe filha de animal), o seu ambiente é a terra (padrão); 
Um urso é um mamífero, cor castanho e o seu alimento preferido é o mel.
Codifique as classes animal, peixe e mamífero.

 */

import java.util.ArrayList;

public class Animal {
    private String nome;
    private int comprimento;
    private String cor;
    private String ambiente;
    private double velocidade;
    private int patas;

    static public ArrayList<Animal> ListaAnimais = new ArrayList<>();

    public static ArrayList<Animal> getListaAnimais() {
        return ListaAnimais;
    }

    public static void AdicionaListaAnimais(Animal animal) {
        ListaAnimais.add(animal);
    }

    Animal() {

    }

    Animal(String nome, String cor, String ambiente, int comprimento, double velocidade, int patas) {
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.comprimento = comprimento;
        this.velocidade = velocidade;
        this.patas = patas;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public String getNome() {
        return nome;
    }

    public int getComprimento() {
        return comprimento;
    }

    public String getCor() {
        return cor;
    }

    public int getPatas() {
        return patas;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    void dados() {
        System.out.println("Animal: " + nome + "\nComprimento: " + comprimento + " cm\nPatas: " + patas
                + "\nCor: " + cor + "\nAmbiente: " + ambiente + "\nVelocidade: " + velocidade + " m/s");
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        ArrayList<Animal> lista = Animal.getListaAnimais();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println(
                    "\n\nDigite a operação que você quer fazer: \n0- Sair do programa\n1- Inserir\n2- Remover\n3-Imprimir a lista atual");
            int operacao = sc.nextInt();
            if (operacao == 1) {
                System.out.println("Digite o tipo do animal: \n1- Mamifero\n2-Peixe\n3-Outro");
                int tipoAnimal = sc.nextInt();
                if (tipoAnimal == 1) {
                    System.out.println(
                            "Digite as seguintes informações:\nNome\nCor\nAlimento\nComprimento\nVelocidade (em m/s)\nQuantidade de patas");
                    String Nome = sc.next();
                    String Cor = sc.next();
                    String Alimento = sc.next();
                    int Comprimento = sc.nextInt();
                    int Velocidade = sc.nextInt();
                    int Patas = sc.nextInt();

                    Animal novo = new Animal(Nome, Cor, Alimento, Comprimento, Velocidade, Patas);
                    lista.add(novo);
                }

            } else if (operacao == 3) {
                imprime(lista);
            } else if (operacao == 0) {
                System.out.println("Programa finalizado!\n");
                break;
            } else {
                System.out.println("Operação inválida!");
                return;
            }
        }

    }

    static void imprime(ArrayList<Animal> lista) {
        System.out.println("Zoo: \n------------------");
        for (Animal animal : lista) {
            animal.dados();
            System.out.println("------------------");
        }
    }
}

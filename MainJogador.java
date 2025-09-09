import java.util.Scanner;
public class MainJogador {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Jogador jogador = new Jogador();

        System.out.println("Digite qual ano você nasceu: ");
        jogador.anoNascimento = sc.nextInt();

        System.out.println("Digite qual sua posição: (1- Atacante, 2- Meio-campo, 3- Defesa)");
        jogador.Posicao = sc.nextInt();

        System.out.println("Sua idade é: " + jogador.idade());

        System.out.println("Você ainda tem " + jogador.faltaAposentar() + " anos de carreira");
    }
}

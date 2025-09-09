public class Jogador{

    String Nome;
    int Posicao;
    int anoNascimento;
    String Nacionalidade;
    double Altura;
    double Peso;

    int idade(){
        return 2025-anoNascimento;
    }

    int faltaAposentar(){

        int anoAposentadoria = 0;

        if (this.Posicao == 1){ //Atacante
            anoAposentadoria = 35;
        }
        else if (this.Posicao == 2){ //Meio-Campo
            anoAposentadoria = 38;
        }
        else if (this.Posicao == 3){ //Defesa
            anoAposentadoria = 40;
        }
        else{
            return 0;
        }
        return anoAposentadoria - idade();
    }
}
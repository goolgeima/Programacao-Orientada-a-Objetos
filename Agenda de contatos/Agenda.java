public class Agenda {
 
    Pessoa[] pessoas = new Pessoa[15];

    void cadastraPessoa (Pessoa p){
        boolean deucerto = false;
        for (int i = 0; i<pessoas.length;i++){
            if (pessoas[i] == null){
                pessoas[i] = p;
                deucerto = true;
                break;
            }
            if (!deucerto){
            System.out.println("Agenda cheia");
        }
    }

    }

    void listaPessoas(){

        for (int i =0;i<pessoas.length;i++){
            if(pessoas[i] != null){
                pessoas[i].imprime();
            }
        }

    }

    boolean buscaPessoa(String nome){
        
        for (int i=0;i<pessoas.length;i++){
            if (pessoas[i]!= null){
                if (this.pessoas[i].nome.equals(nome)){
                    return true;
                }
            }
        }

        return false;
    }

}

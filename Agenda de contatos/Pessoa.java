public class Pessoa {
    
    String nome;
    Data dataNasc;
    Contato[] contatos = new Contato[4];

    void cadastraContato(Contato c){
    boolean deucerto = false;
        for (int i = 0; i< contatos.length; i++){
            if (contatos[i] == null){
                contatos[i] = c;
                deucerto = true;
                break;
            }
        }
        if (!deucerto){
        System.out.println("Contatos lotados");}

    }

    void listaContatos(){

        System.out.println("Contatos:\n");
        for (int i=0; i< contatos.length; i++){
            if (contatos[i] != null){
                contatos[i].imprime();
            }
        }

    }

    void imprime(){
        System.out.println("Nome: " + this.nome + "\nData de nascimento: ");
        dataNasc.imprime();
        this.listaContatos();
    }

    void cadastraPessoa(String n, Data data){
        Pessoa pes = new Pessoa();
        pes.nome = n;
        pes.dataNasc = data;
    }
}

/*
Implemente um sistema de Agenda de Contatos que contenha as classes 
Data (com dia, mês e ano), Contato (indicando se é Whatsapp ou Telegram e 
armazenando um número em string) e Pessoa (com nome, data de 
nascimento e até quatro contatos), incluindo métodos para cadastrar e listar 
contatos. Crie ainda a classe Agenda, capaz de armazenar até quinze 
pessoas, permitindo cadastrar, listar todas e buscar uma pessoa pelo nome. 
No programa principal, instancie a agenda, cadastre 15 pessoas com seus 
dados e contatos, liste todas as cadastradas e possibilite a pesquisa por 
nome para exibir as informações completas da pessoa encontrada.

*/

public class Main {
    
    public static void main(String[] args){
Data data = new Data();
    data.dia = 20;
    data.mes = 06;
    data.ano = 2005;
        
Pessoa eu = new Pessoa();
    eu.nome = "Gustavo";
    eu.dataNasc = data;
            
Agenda agenda = new Agenda();
    agenda.cadastraPessoa(eu);
            
Contato mae = new Contato();
mae.Numero = "48991234567";
mae.Telegram = true;
mae.Whatsapp = true;

Contato pai = new Contato();
pai.Numero = "48997654321";
pai.Telegram = false;
pai.Whatsapp = true;

Contato helo = new Contato();
helo.Numero = "47999887766";
helo.Telegram = true;
helo.Whatsapp = false;

Contato fer = new Contato();
fer.Numero = "48994561234";
fer.Telegram = false;
fer.Whatsapp = true;

Contato luis = new Contato();
luis.Numero = "48998761234";
luis.Telegram = true;
luis.Whatsapp = true;

Contato clovis = new Contato();
clovis.Numero = "48993456789";
clovis.Telegram = false;
clovis.Whatsapp = false;

Contato vizinho = new Contato();
vizinho.Numero = "48995553322";
vizinho.Telegram = true;
vizinho.Whatsapp = true;

Contato vo = new Contato();
vo.Numero = "48990011223";
vo.Telegram = false;
vo.Whatsapp = true;

Contato tio = new Contato();
tio.Numero = "48998887711";
tio.Telegram = true;
tio.Whatsapp = false;

Contato tia = new Contato();
tia.Numero = "48991112233";
tia.Telegram = true;
tia.Whatsapp = true;

Contato irmao = new Contato();
irmao.Numero = "48992223344";
irmao.Telegram = false;
irmao.Whatsapp = true;

Contato irma = new Contato();
irma.Numero = "48993334455";
irma.Telegram = true;
irma.Whatsapp = true;

Contato primo = new Contato();
primo.Numero = "48994445566";
primo.Telegram = false;
primo.Whatsapp = false;

Contato professora = new Contato();
professora.Numero = "48995556677";
professora.Telegram = true;
professora.Whatsapp = true;

Contato chefe = new Contato();
chefe.Numero = "48996667788";
chefe.Telegram = false;
chefe.Whatsapp = true;


        
            
eu.cadastraContato(mae);
eu.cadastraContato(chefe);
// eu.cadastraContato(professora);
// eu.cadastraContato(pai);

 eu.listaContatos();
            

        }
}

public class CaixasRetangulares{

    double largura;
    double profundidade;
    double altura;

    double volume(){
        return largura * profundidade * altura;
    }

    double area(){
        return 2 * ((largura * profundidade) + (largura * altura) + (profundidade * altura));
    }

}
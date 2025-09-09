public class CaixasCilindricas {
    
    double diametro;
    double altura;

    double volume(){
        return diametro*altura;
    }

    double area(){
        return 2 * 3.14 * ((this.diametro/2) + altura); //2πr(r + h)
    }

}

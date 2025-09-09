import java.util.Scanner;
public class MainCaixas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int modelo;
        
        System.out.println("Digite qual modelo de caixa você deseja: 1- Retangular 2-Cilíndrica ");
        modelo = sc.nextInt();
        
        if (modelo == 1){
            CaixasRetangulares caixaretangular = new CaixasRetangulares();
            System.out.println("Digite a altura da caixa: ");
            caixaretangular.altura = sc.nextDouble();
            System.out.println("Digite a largura da caixa: ");
            caixaretangular.largura = sc.nextDouble();
            System.out.println("Digite a profundidade da caixa: ");
            caixaretangular.profundidade = sc.nextDouble();

            System.out.println("Área da caixa: " + caixaretangular.area());
            System.out.println("Volume da caixa: " + caixaretangular.volume());

        }
        else if (modelo ==2){
            CaixasCilindricas caixacilindrica = new CaixasCilindricas();
            System.out.println("Digite o diâmetro da caixa: ");
            caixacilindrica.diametro = sc.nextDouble();
            System.out.println("Digite a altura da caixa: ");
            caixacilindrica.altura = sc.nextDouble();
            
            System.out.println("Área da caixa: " + caixacilindrica.area());
            System.out.println("Volume da caixa: " + caixacilindrica.volume());
        }
        else{
            System.out.println("Modelo inválido de caixa!");
            return;
        }

    }
}

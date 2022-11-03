import java.util.Scanner;

public class Fabrica {
        public static void main(String[] args) {


            Scanner fabric = new Scanner(System.in);

            Highlander h1, h2, h3;
            h2 = Highlander.obterInstancia();
            h3 = Highlander.obterInstancia();


            System.out.println("Digite um numero para criação N vezes do objeto");
            int n = fabric.nextInt();
            for (int i = 0; i < n; i++) {
                h1 = Highlander.obterInstancia();
                System.out.println(h1);
            }

            System.out.println("Objeto criado " + Highlander.getContChamadas());



            System.out.println("-------------------------------------------");
            if (h2 == h3) {
                System.out.println("h2 e h3 são mesmo objeto!");
            }
        }
}

import java.util.Scanner;

// testar a implementação de suas classes.

public class App    {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true)    {
            System.out.println("----------");
            System.out.println("-- MENU --");
            System.out.println("----------");
            System.out.println("1. Registrar Score.");
            System.out.println("2. Lista top10 Scores.");
            System.out.println("3. Fechar programa.");
            System.out.println("Escolha sua opcao.");
            int op =sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Informe seu nome e a sua pontuacao.");
                    String nome = sc.next();
                    int pont = sc.nextInt();

                //implementar exceção de nome null e score negativo
                try {
                    GameEntry entry = new GameEntry(nome, pont);
                } 
                catch (IllegalArgumentException e) {
                    //TODO
                    System.out.println(e.getMessage());
                }
                    break;
                case 2:
                    //imprimir top10 scores

                    break;
                case 3:
                    System.out.println("Finalizando Programa....");
                    System.exit(0);
                    break;
            }

        }

    }
}

import java.util.Scanner;

// testar a implementação de suas classes.

public class App    {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScoresImplements si = new ScoresImplements();
        while (true)    {
            System.out.println("\n----------");
            System.out.println("-- MENU --");
            System.out.println("----------\n");
            System.out.println("1. Registrar Score.");
            System.out.println("2. Lista top10 Scores.");
            System.out.println("3. Fechar programa.");
            System.out.println("Escolha sua opcao.");
            int op =sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\nInforme seu nome e a sua pontuacao.");
                    String nome = sc.next();
                    int pont = sc.nextInt();

                //implementar exceção de nome null e score negativo
                try {
                    GameEntry entry = new GameEntry(nome, pont);
                    si.add(entry);
                } 
                catch (IllegalArgumentException e) {
                    //TODO
                    System.out.println(e.getMessage());
                }
                    break;
                case 2:
                    si.imprime();
                    break;
                case 3:
                    sc.close(); 
                    System.out.println("Finalizando Programa....");
                    System.exit(0);
                    break;
            }
        }
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

// testar a implementação de suas classes.

public class App    {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScoresImplements si = new ScoresImplements();
        ScoresSerializacao ss = new ScoresSerializacao();

        while (true)    {
            System.out.println("\n----------");
            System.out.println("-- MENU --");
            System.out.println("----------\n");
            System.out.println("1. Registrar Score.");
            System.out.println("2. Lista top10 Scores.");
            System.out.println("3. Imprimir arquivo com top10 Scores.");
            System.out.println("4. Fechar programa.");
            System.out.println("Escolha sua opcao.");
            try {
                int op = sc.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("\nInforme seu nome:");
                        sc.nextLine();
                        String nome = sc.nextLine();
                        System.out.println("Informe sua pontuacao");
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
                        System.out.println(si.toString());
                        break;
                    case 3:
                        ss.lerDados();
                        ss.escreverDados();
                        System.out.println("Arquivo escrito!");
                        break;
                    case 4:
                        sc.close();
                        System.out.println("Finalizando Programa....");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Escolha uma opção válida");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Insira uma entrada válida");
                sc.next();
            }

        }
    }
}

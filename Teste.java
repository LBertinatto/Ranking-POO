public class Teste {
    public static void main(String[] args) {
        ScoresImplements scoreTeste = new ScoresImplements();
        scoreTeste.add(new GameEntry("Mauro", 111));
        scoreTeste.add(new GameEntry("Joao", 865));
        scoreTeste.add(new GameEntry("Maria", 1));
        scoreTeste.add(new GameEntry("Alex", 492));
        scoreTeste.add(new GameEntry("Bob", 17));
        scoreTeste.add(new GameEntry("Julia", 237));
        scoreTeste.add(new GameEntry("Wesley", 647));
        scoreTeste.add(new GameEntry("Julio", 67));
        scoreTeste.add(new GameEntry("Bernardo", 56));
        scoreTeste.add(new GameEntry("Mauro", 999));

        System.out.println(scoreTeste);

    }
}

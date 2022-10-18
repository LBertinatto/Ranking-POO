
import java.util.TreeSet;

public class ScoresImplements implements Scores{
    private static TreeSet<GameEntry> scores;
    private static int capacity = 10;

    public ScoresImplements(){
        scores = new TreeSet<>();
    }
    
    /* 
     * Adiciona um novo score se ele for grande o suficiente
     * Retorna verdadeiro se foi adicionado,falso caso contrário
     */
    public static boolean add(GameEntry e) {
        if(scores.size() != capacity){
            scores.add(e);
            return true;
        }else{
            if(e.getScore() > scores.last().getScore()){
                scores.pollFirst();
                scores.add(e);
                return true;
            }
        }
        return false;
    }
    public static void addGameEntry(GameEntry e){
        add(e);
    }

    /** Retorna o score na posição i */
    @Override
    public GameEntry get(int i) {
        Object[] aux = new Object[scores.size()];
        aux = scores.toArray();

        return (GameEntry) aux[i] ;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public int getNumScores() {
        return scores.size();
    }

    public static void imprime(){
        for (GameEntry gameEntry : scores) {
            System.out.println(String.format("Jogador: %s%nPontuação: %d",gameEntry.getName(), gameEntry.getScore()));
        }
    }
    
    public static TreeSet<GameEntry> Scores(){
        return scores;
    }
}
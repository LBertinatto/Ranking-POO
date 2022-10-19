
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ScoresImplements implements Scores{
    private static ArrayList<GameEntry> scores;
    private static int capacity = 10;

    public ScoresImplements(){
        scores = new ArrayList<>();
    }
    
    /* 
     * Adiciona um novo score se ele for grande o suficiente
     * Retorna verdadeiro se foi adicionado,falso caso contrário
     */
    public boolean add(GameEntry e) {
        sortScores();

        if(scores.size() != capacity){
            scores.add(e);
            return true;
        }else{
            if(e.getScore() > scores.get(scores.size()).getScore()){
                scores.remove(scores.size());
                scores.add(e);
                return true;
            }
        }
        return false;
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

    public void imprime(){
        sortScores();
        
        for (GameEntry gameEntry : scores) {
            System.out.println(String.format("Jogador: %s%nPontuação: %d",gameEntry.getName(), gameEntry.getScore()));
            System.out.println("\n");
        }
    }

    public class SortScoresImplements implements Comparator<GameEntry> {

        @Override
        public int compare(GameEntry a, GameEntry b) {
            if ((a.getScore() > b.getScore()))return 1;
            if ((a.getScore() < b.getScore()))return -1;
            return 0;  
        }
    }

    public void sortScores() {
        Collections.sort(scores, new SortScoresImplements());
    }   
 }

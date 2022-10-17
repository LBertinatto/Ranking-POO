
import java.util.TreeSet;

public class ScoresImplements implements Scores{
    private TreeSet<GameEntry> scores;

    public ScoresImplements(){
        scores = new TreeSet<>();
    }
    
    /* 
     * Adiciona um novo score se ele for grande o suficiente
     * Retorna verdadeiro se foi adicionado,falso caso contrário
     */
    @Override
    public boolean add(GameEntry e) {
        if(scores.size() != getCapacity()){
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

    /** Retorna o score na posição i */
    @Override
    public GameEntry get(int i) {
        Object[] aux = new Object[scores.size()];
        aux = scores.toArray();

        return (GameEntry) aux[i] ;
    }

    @Override
    public int getCapacity() {
        return 10;
    }

    @Override
    public int getNumScores() {
        return scores.size();
    }

}
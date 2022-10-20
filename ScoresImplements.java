
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ScoresImplements implements Scores{
    private static ArrayList<GameEntry> scores;
    private static final int capacity = 10;

    public ScoresImplements(){
        scores = new ArrayList<>();
    }
    
    /* 
     * Adiciona um novo score se ele for grande o suficiente
     * Retorna verdadeiro se foi adicionado,falso caso contrário
     */
    public boolean add(GameEntry e) {
        if(scores.size() != capacity){
            scores.add(e);
            Collections.sort(scores);
            return true;

        }else {
            for (GameEntry g : scores) {
                if (e.getScore()>g.getScore()) {
                    scores.add(e);
                    scores.remove(capacity-1);
                    Collections.sort(scores);
                    return true;
                }
            }
        }
        return false;
    }

    /** Retorna o score na posição i */
    @Override
    public GameEntry get(int i) {
        return scores.get(i);

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
        System.out.println("      Jogador          ,      Score    ");
        System.out.println("---------------------------------------------");
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append('[');
        for (int i=0; i<scores.size(); i++) {
            s.append("(" + scores.get(i).getName() + "," + scores.get(i).getScore() + ")");
            if (i!= scores.size()-1) s.append(", ");
        }
        s.append(']');
        return s.toString();
   
    }
}

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ScoresSerializacao {

    ScoresImplements si = new ScoresImplements();
    GameEntry ge = new GameEntry();

    ArrayList <String> dados = new ArrayList<>();
    ArrayList <GameEntry> scores = si.getScores();
    
    public void lerDados()  {
        for (int i = 0; i < scores.size(); i++) {
            dados.add(scores.get(i).getName()+","+scores.get(i).getScore());

        }
    }

    public void escreverDados() {
        String path = "ScoreDados.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path)))  {
            for (String dado : dados)   {
                bw.write(dado);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

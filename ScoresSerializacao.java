import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ScoresSerializacao {

    ArrayList <GameEntry> dados = new ArrayList<>();

    public void lerDados()  {
        dados = ScoresImplements.getScores();
    }

    public void escreverDados() {
        String path = "ScoreDados.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path)))  {
            for (GameEntry dado : dados)   {
                bw.write(String.valueOf(dado));
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

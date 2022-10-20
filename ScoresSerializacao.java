import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ScoresSerializacao {

    ScoresImplements si = new ScoresImplements();
    GameEntry ge = new GameEntry();

    ArrayList <String> dados = new ArrayList<>();
    ArrayList <GameEntry> scores = si.getScores();
    
    private void lerDados()  {
        dados = new ArrayList<>();
        for (int i = 0; i < scores.size(); i++) {
            dados.add(scores.get(i).getName()+","+scores.get(i).getScore());

        }
    }

    public void escreverDados() {
        lerDados();
        String path = "ScoreDados.csv";


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path)))  {
            bw.write("sep=,");
            bw.newLine();
            for (String dado : dados)   {
                bw.write(dado);
                bw.newLine();
            }
            System.out.println("Arquivo escrito!");
        } catch (IOException e) {
            System.out.println("Não foi possível escrever o arquivo");
        }
    }

}

/* Construa uma  classe  que  implementa
  a  interface Scoresde  maneira  adequada.
  Lembre-se que a coleção deve possui 
  uma número máximo de scores armazenados.
*/

public interface Scores {

    /** Retorna uma string representando o objeto*
     *  Formato: [(<name>, <score>), (<name>, <score>) ...]* 
     * Exemplo: [(John, 10), (Carol, 5), (Dan, 3)]
     * ORDEM SEMPRE DECRESCENTE
     * QUANDO UM NOVO "MELHOR SCORE" FOR ADICIONADO
     * DEVE RETIRAR O MENOR SCORE
    */
    String toString();

    /** Adiciona um novo score se ele for grande o suficiente* 
     * Retorna verdadeiro se foi adicionado,falso caso contrário*/
    static boolean add(GameEntry e){
      return false;
    }

    /** Retorna o score na posição i */
    GameEntry get(int i);
    
    /** Retorna a capacidade máxima dacoleção
     * 10 SCORES EH A CAPACIDADE MAXIMA*/
    int getCapacity();

    /** Retorna o número de scores armazenados */
    int getNumScores();
    
}

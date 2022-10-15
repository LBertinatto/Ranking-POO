/*Implementea classe GameEntryfazendo
 * uso de exceções para indicar valores
 * inválidos para o nome (objetos null ou
 * strings vazias ou com somente caracteres
 * em branco) e score(valores negativos).
 */

public class GameEntry {
    private String name;
    private int score;

    public GameEntry(String n, int s)   {
        name=n;
        score=s;
    }

    public String getName()     {
        return name;
    }

    public int getScore()   {
        return score;
    }
    
    /** Retorna uma string representando o objeto *  
     * Formato: (<name>, <score>)* 
     * Exemplo: (John, 10)*/
    public String toString()    {
        return "("+getName()+","+
                " "+getScore()+")";
    }

}
/*Implementea classe GameEntryfazendo
 * uso de exceções para indicar valores
 * inválidos para o nome (objetos null ou
 * strings vazias ou com somente caracteres
 * em branco) e score(valores negativos).
 */

import java.util.Comparator;

public class GameEntry implements Comparable<GameEntry> {
    private String name;
    private Integer score;

    public GameEntry(String n, int s)   {
        if (n==null || n.isBlank())   {
            IllegalArgumentException e = new IllegalArgumentException("Nome invalido!");
            throw e;
        }
        else name = n;
        if (s<0)    {
            IllegalArgumentException e = new IllegalArgumentException("Valor invalido!");
            throw e;
        }
        else score = s;
    }

    public String getName()     {
        return name;
    }

    public int getScore()   {
        return score;
    }
    
    /** Retorna uma string representando o objeto *  
     * Formato: (<name>, <score>)* 
     * Exemplo: (John, 10)
     * FEITO!!!!
     */ 
    public String toString()    {
        return "("+getName()+","+
                " "+getScore()+")";
    }

    @Override
    public int compareTo(GameEntry o) {
        if (score>o.getScore()) return -1;
        if (score<o.getScore()) return 1;
        return 0;
    }
}

import java.lang.*;
public class KochCurve implements LSystem
{
    String startWord, ruleWord;
    Character ruleSymbol;

    public void setStart(String start)
    {
        startWord = start;
    }

    public void addRule(Character symbol, String word)
    {
        ruleSymbol = symbol;
        ruleWord = word;
    }

    public String iter(int n)
    {
        String word = startWord;
        for(int i = 0; i < n; i++)
        {
            String currentSymbol = ruleSymbol.toString();
            word = word.replaceAll(currentSymbol, ruleWord);
        }
        return word;
    }
}

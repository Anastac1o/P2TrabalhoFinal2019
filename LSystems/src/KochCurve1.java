import java.util.Vector;

public class KochCurve1 implements LSystem {

    String startWord;
    Vector<Character> symbolList = new Vector<>();
    Vector<String>    ruleList   = new Vector<>();


    public void setStart(String start) {
        startWord = start;
    }


    public void addRule(Character symbol, String word) {
        symbolList.add(symbol);
        ruleList.add(word);
    }


    public String iter(int n) {
        return null;
    }

}


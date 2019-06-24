import java.util.Vector;

public class SierpinskiArrowhead implements LSystem {
    String startWord;
    Vector<String> ruleWord = new Vector<>();
    Vector<Character> ruleSymbol = new Vector<>();
    int numIter;

    public void setStart(String start) {
        startWord = start;
    }


    public void addRule(Character symbol, String word) {
        this.ruleWord.add(word);
        this.ruleSymbol.add(symbol);
    }


    public String iter(int n) { Character currentSymbol;
        String currentWord = startWord;
        String finalWord = "";

        for(int iter = 0; iter < n; iter++){
            finalWord = "";

            for(int i = 0; i < currentWord.length(); i++){
                currentSymbol = currentWord.charAt(i);
                String currentSymbolString = currentSymbol.toString();
                int index = ruleSymbol.indexOf(currentSymbol);

                finalWord += currentSymbolString.replace(currentSymbolString, ruleWord.elementAt(index));

            }
            currentWord = finalWord;

        }
        return finalWord;
    }
}
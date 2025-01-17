public class KochSnowflake implements LSystem {

    String startWord, ruleWord;
    Character ruleSymbol;

    public void setStart(String start) {
        startWord = start;
    }


    public void addRule(Character symbol, String word) {
        ruleWord = word;
        ruleSymbol = symbol;
    }


    public String iter(int n) {
        String word = startWord;
        for(int i = 0; i < n; i++){
            String currentSymbol = ruleSymbol.toString();
            word = word.replaceAll(currentSymbol, ruleWord);
        }
        return word;
    }
}
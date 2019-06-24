import java.util.Vector;

import java.util.Vector;

public class SierpinskiTriangle implements LSystem {
    String startWord;
    Vector<String> ruleWord = new Vector<>();
    Vector<Character> ruleSymbol = new Vector<>();


    public void setStart(String start) {
        this.startWord = start;
    }


    public void addRule(Character symbol, String word) {
        this.ruleWord.add(word);
        this.ruleSymbol.add(symbol);
    }


    public String iter(int n) {
        Character currentSymbol;
        String currentWord = startWord;
        String finalWord = "";

        for(int iter = 0; iter < n; iter++){
            finalWord = "";
            //System.out.println(iter +" "+  currentWord);
            for(int i = 0; i < currentWord.length(); i++){
                currentSymbol = currentWord.charAt(i);
                String currentSymbolString = currentSymbol.toString();
                int index = ruleSymbol.indexOf(currentSymbol);

                finalWord += currentSymbolString.replace(currentSymbolString, ruleWord.elementAt(index));
                System.out.println(finalWord + " " + index + "" + currentSymbolString + " " + currentWord);
            }
            currentWord = finalWord;

        }
        return finalWord;
    }
}


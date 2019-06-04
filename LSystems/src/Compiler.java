import java.util.Vector;

public class Compiler {
    Vector<Character> letterList = new Vector<>();
    Vector<TurtleStatement> rulesList = new Vector<>();

    public void addRule(Character letter, TurtleStatement statement) {
        letterList.add(letter);
        rulesList.add(statement);
    }

    protected TurtleStatement compile(Character c) {
        if(letterList.contains(c)){
            int index = letterList.indexOf(c);
            return rulesList.elementAt(index);
        }
        return null;
    }

    protected Vector<TurtleStatement> compile(String word) {
        Vector<TurtleStatement> result = new Vector<>();
        for (int i = 0; i < word.length(); i++) {
            result.add(compile(word.charAt(i)));
        }
        return result;
    }
}


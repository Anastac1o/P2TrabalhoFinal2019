import java.util.Vector;

public class KochCurveTester {
    int numIter;

    public void draw(int numIter) {
        KochCurve curva = new KochCurve();

        curva.setStart("F");
        curva.addRule('F', "F+F-F-F+F");
        String word1 = curva.iter(numIter);

        //System.out.println(word1);

        Compiler compiler = new Compiler();
        compiler.addRule('F', new Forward((20 / Math.pow(numIter,1.26816))));
        compiler.addRule('+', new Turn(90));
        compiler.addRule('-', new Turn(-90));


        System.out.println(compiler.rulesList);
        System.out.println(compiler.letterList);
        System.out.println(compiler.compile(word1));
        System.out.println(word1);
        Vector<TurtleStatement> compilado;
        compilado = compiler.compile(word1);

        TurtleInterpreter interpreter = new TurtleInterpreter();
        interpreter.run(compilado);
    }
}

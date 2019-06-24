import java.util.Vector;

public class SierpinskiArrowheadTester {
    public void draw(int numIter){
        SierpinskiArrowhead arrowhead = new SierpinskiArrowhead();
        arrowhead.setStart("A");
        arrowhead.addRule('-',"-");
        arrowhead.addRule('+',"+");
        arrowhead.addRule('A', "B-A-B");
        arrowhead.addRule('B', "A+B+A");
        String word5 = arrowhead.iter(numIter);

        Compiler triangleCompiler = new Compiler();
        triangleCompiler.addRule('A', new Forward(5));
        triangleCompiler.addRule('B', new Forward(5));
        triangleCompiler.addRule('+', new Turn(-60));
        triangleCompiler.addRule('-', new Turn(60));

        Vector<TurtleStatement> triangleCompilado;
        triangleCompilado = triangleCompiler.compile(word5);
        TurtleInterpreter triangleInterpreter = new TurtleInterpreter();
        triangleInterpreter.run(triangleCompilado);
    }
}

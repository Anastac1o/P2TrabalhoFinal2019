import java.util.Vector;

public class SierpinskiTriangleTester {
    public void draw(int numIter) {
        SierpinskiTriangle triangle = new SierpinskiTriangle();

        triangle.setStart("F-G-G");
        triangle.addRule('-',"-");
        triangle.addRule('+',"+");
        triangle.addRule('G', "GG");
        triangle.addRule('F', "F-G+F+G-F");
        String word4 = triangle.iter(numIter);

        System.out.println(word4);

        Compiler triangleCompiler = new Compiler();
        triangleCompiler.addRule('F', new Forward(5));
        triangleCompiler.addRule('G', new Forward(5));
        triangleCompiler.addRule('+', new Turn(120));
        triangleCompiler.addRule('-', new Turn(-120));

        Vector<TurtleStatement> triangleCompilado;
        triangleCompilado = triangleCompiler.compile(word4);
        TurtleInterpreter triangleInterpreter = new TurtleInterpreter();
        triangleInterpreter.run(triangleCompilado);
    }
}

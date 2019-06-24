import java.util.Vector;

public class CantorSetTester {
    public void draw(int numIter){
        CantorSet cantor = new CantorSet();

        cantor.setStart("AB");
        cantor.addRule('A',"ABA");
        cantor.addRule('B',"BBB");

        String word1 = cantor.iter(numIter);

        Compiler compiler = new Compiler();
        compiler.addRule('A', new Forward(100/(numIter*3)));
        compiler.addRule('B', new Leap(100/(numIter* 3)));

        System.out.println(word1);
        Vector<TurtleStatement> compilado;
        compilado = compiler.compile(word1);

        TurtleInterpreter interpreter = new TurtleInterpreter();
        interpreter.run(compilado);
    }
}

import java.util.Vector;

public class CantorSetTester {
    public void draw(int numIter){
        CantorSet cantor = new CantorSet();

        cantor.setStart("AB");
        cantor.addRule('A',"ABA");
        cantor.addRule('B',"BBB");

        String word1 = cantor.iter(numIter);

        Compiler compiler = new Compiler();
        compiler.addRule('A', new DrawForward(100));
        compiler.addRule('B', new MoveForward(100));
        compiler.addRule(' ', new Leap(0, -10));
        for (int i=0; i<word1.length(); i++){

        }

        System.out.println(word1);
        Vector<TurtleStatement> compilado;
        compilado = compiler.compile(word1);

        TurtleInterpreter interpreter = new TurtleInterpreter();
        interpreter.run(compilado);
    }
}

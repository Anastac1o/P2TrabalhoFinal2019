import java.util.Vector;

public class KochSnowflakeTester {
    public void draw(int numIter){
        KochSnowflake snowflake = new KochSnowflake();

        snowflake.setStart("F");
        snowflake.addRule('F', "F+F--F+F");
        String word3 = snowflake.iter(numIter);

        System.out.println(word3);

        Compiler snowflakeCompiler = new Compiler();
        snowflakeCompiler.addRule('F', new Forward((50/numIter+1)));
        snowflakeCompiler.addRule('+', new Turn(60));
        snowflakeCompiler.addRule('-', new Turn(-60));

        Vector<TurtleStatement> snowflakeCompilado;
        snowflakeCompilado = snowflakeCompiler.compile(word3);
        TurtleInterpreter snowflakeInterpreter = new TurtleInterpreter();
        snowflakeInterpreter.run(snowflakeCompilado);
    }
}

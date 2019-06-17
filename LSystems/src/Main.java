import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("LSystem\nEscolha uma das seguintes opções:");
        System.out.println("1 - KochCurve");
        System.out.println("2 - KochSnowflake");
        System.out.println("3 - SierpinskiTriangle");
        System.out.println("4 - SierpinskiArrowhead");
        System.out.println("5 - Dragon Curve");
        System.out.println("6 - Cantor Set");

        int userChoice = scanner.nextInt();

        if (userChoice == 1) {
            drawCurve(3);
        }
        if (userChoice == 2) {
            drawSnowflake(3);
        }
        if (userChoice == 3) {
            drawTriangle(3);
        }
        if (userChoice == 4) {
            drawArrowhead(5);
        }
        if (userChoice == 5) {
            drawDragonCurve(3);
        }
        if (userChoice == 6) {
            drawCantorSet(3);
        }
    }

    public static void drawCantorSet(int numIter) {
        CantorSet cantor = new CantorSet();
        cantor.setStart("AB");
        cantor.addRule('A', "ABA");
        cantor.addRule('B', "BBB");
        String word1 = cantor.iter(numIter);

        Compiler cantorCompiler = new Compiler();
        cantorCompiler.addRule('A', new Forward(5));
        cantorCompiler.addRule('B', new Leap(5));

        Vector<TurtleStatement> cantorCompilado;
        cantorCompilado = cantorCompiler.compile(word1);
        TurtleInterpreter cantorInterpreter = new TurtleInterpreter();
        cantorInterpreter.run(cantorCompilado);
    }

    public static void drawCurve(int numIter) {
        KochCurve curve = new KochCurve();
        curve.setStart("F");
        curve.addRule('F', "F+F-F-F+F");
        String word2 = curve.iter(numIter);

        Compiler curveCompiler = new Compiler();
        curveCompiler.addRule('F', new Forward((20 / Math.pow(numIter, 1.26816))));
        curveCompiler.addRule('+', new Turn(90));
        curveCompiler.addRule('-', new Turn(-90));

        Vector<TurtleStatement> curveCompilado;
        curveCompilado = curveCompiler.compile(word2);
        TurtleInterpreter curveInterpreter = new TurtleInterpreter();
        curveInterpreter.run(curveCompilado);
    }

    public static void drawSnowflake(int numIter) {
        KochSnowflake snowflake = new KochSnowflake();
        snowflake.setStart("F");
        snowflake.addRule('F', "F+F--F+F");
        String word3 = snowflake.iter(numIter);

        Compiler snowflakeCompiler = new Compiler();
        snowflakeCompiler.addRule('F', new Forward((20 / Math.pow(numIter, 1.26816))));
        snowflakeCompiler.addRule('+', new Turn(60));
        snowflakeCompiler.addRule('-', new Turn(-60));

        Vector<TurtleStatement> snowflakeCompilado;
        snowflakeCompilado = snowflakeCompiler.compile(word3);
        TurtleInterpreter snowflakeInterpreter = new TurtleInterpreter();
        snowflakeInterpreter.run(snowflakeCompilado);

    }

    public static void drawTriangle(int numIter) {
        SierpinskiTriangle triangle = new SierpinskiTriangle();
        triangle.setStart("F-G-G");
        triangle.addRule('G', "GG");
        triangle.addRule('F', "F-G+F+G-F");
        String word4 = triangle.iter(numIter);

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

    public static void drawArrowhead(int numIter) {
        SierpinskiArrowhead arrowhead = new SierpinskiArrowhead();
        arrowhead.setStart("A");
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

    public static void drawDragonCurve(int numIter){
        DragonCurve dcurve = new DragonCurve();
        dcurve.setStart("FX");
        dcurve.addRule('X', "X+YF+");
        dcurve.addRule('Y', "-FX-Y");
        String word6 = dcurve.iter(numIter);

        Compiler dcurveCompiler = new Compiler();
        dcurveCompiler.addRule('F', new Forward(5));
        dcurveCompiler.addRule('+', new Turn(-90));
        dcurveCompiler.addRule('-', new Turn(90));

        Vector<TurtleStatement> dcurveCompilado;
        dcurveCompilado = dcurveCompiler.compile(word6);
        TurtleInterpreter dcurveInterpreter = new TurtleInterpreter();
        dcurveInterpreter.run(dcurveCompilado);
    }

}
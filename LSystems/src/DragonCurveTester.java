import java.util.Vector;

public class DragonCurveTester {
    public void draw(int numIter){
        DragonCurve dcurve = new DragonCurve();
        dcurve.setStart("FX");
        dcurve.addRule('-',"-");
        dcurve.addRule('+',"+");
        dcurve.addRule('X', "X+YF+");
        dcurve.addRule('Y', "-FX-Y");
        dcurve.addRule('F',"F");
        String word6 = dcurve.iter(numIter);

        Compiler dcurveCompiler = new Compiler();
        dcurveCompiler.addRule('F', new Forward(50/numIter));
        dcurveCompiler.addRule('+', new Turn(90));
        dcurveCompiler.addRule('-', new Turn(-90));
        dcurveCompiler.addRule('X', null);
        dcurveCompiler.addRule('Y',null);

        Vector<TurtleStatement> dcurveCompilado;
        dcurveCompilado = dcurveCompiler.compile(word6);
        TurtleInterpreter dcurveInterpreter = new TurtleInterpreter();
        dcurveInterpreter.run(dcurveCompilado);
    }
}

import galapagos.Turtle;

import java.util.Stack;
import java.util.Vector;

public class TurtleInterpreter implements Interpreter {

    Turtle turtle = new Turtle();

    public void run(Vector<TurtleStatement> program) {
        turtle.speed(10000);
        for(int i=0; i < program.size(); i++){
            program.elementAt(i).run(this);
        }

    }

    public void runDrawForward(DrawForward statement) {
        turtle.forward(statement.getDistance());
    }

    public void runMoveForward(MoveForward statement){
        turtle.penUp();
        turtle.forward(statement.getDistance());
        turtle.penDown();
    }

    public void runTurn(Turn statement) {
        turtle.turn(statement.getAngle());
    }

    public void runPenUp(PenUp statement) {
        turtle.penUp();
    }

    public void runPenDown(PenDown statement) {
        turtle.penDown();
    }
    public void runLeap(Leap statement){
        turtle.jumpTo(statement.getX(),statement.getY());
    }
}

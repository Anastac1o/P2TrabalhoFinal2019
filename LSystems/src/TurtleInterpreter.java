import galapagos.Turtle;
import java.util.*;

public class TurtleInterpreter implements Interpreter {

    Turtle turtle = new Turtle();

    public void run(Vector<TurtleStatement> program) {
        turtle.speed(1000);
        for(int i = 0; i < program.size(); i++){
            if(program.elementAt(i) != null)
            program.elementAt(i).run(this);
        }
    }

    public void run(Forward statement) {
        turtle.forward(statement.getDistance());
    }
    public void run(Turn statement) { turtle.turn(statement.getAngle()); }
    public void run(PenUp statement) {
        turtle.penUp();
    }
    public void run(PenDown statement) {
        turtle.penDown();
    }
    public void run(Leap statement){
        Vector<TurtleStatement> moveForward = new Vector<>();
        moveForward.add(new PenUp());
        moveForward.add(new Forward(5));
        moveForward.add(new PenDown());
        this.run(moveForward);
    }
}

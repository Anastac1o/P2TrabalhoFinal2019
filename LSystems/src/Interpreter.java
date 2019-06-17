import java.util.Vector;

public interface Interpreter {
    void run(Vector<TurtleStatement> program);
    void run(Forward statement);
    void run(Turn statement);
    void run(PenUp statement);
    void run(PenDown statement);
    void run(Leap statement);
}

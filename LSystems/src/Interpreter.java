import java.util.Vector;

public interface Interpreter {
    void run(Vector<TurtleStatement> program);
    void runDrawForward(DrawForward statement);
    void runTurn(Turn statement);
    void runPenUp(PenUp statement);
    void runPenDown(PenDown statement);
    void runLeap(Leap statement);
    void runMoveForward(MoveForward statement);
}

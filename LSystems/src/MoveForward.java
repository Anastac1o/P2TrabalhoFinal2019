public class MoveForward extends TurtleStatement{
    double distance;
    public MoveForward(double distance){ this.distance = distance;}

    public double getDistance() {
        return distance;
    }

    public void run(Interpreter interpreter) {
        interpreter.runMoveForward(this);
    }
}

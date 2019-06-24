public class Leap extends TurtleStatement {
    double x,y;
    public Leap(double x, double y){this.x = x; this.y = y;}

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public void run(Interpreter interpreter){
        interpreter.runLeap(this);
    }
}

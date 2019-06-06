public class DrawForward extends TurtleStatement{
    double distance;
    public DrawForward(double distance){ this.distance = distance;}
    public double getDistance(){ return distance; }
    public void run(Interpreter interpreter){
        interpreter.runDrawForward(this);
    }
}

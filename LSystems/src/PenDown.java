public class PenDown extends TurtleStatement {
    boolean penDown;
    public PenDown(boolean penDown){ this.penDown = penDown; }
    public boolean getPenDown(){ return penDown; }
    public void run(Interpreter interpreter){ interpreter.runPenDown(this);}
}

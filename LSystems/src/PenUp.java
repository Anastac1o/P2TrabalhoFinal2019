public class PenUp {
    boolean penUp;
    public PenUp(boolean penUp){ this.penUp = penUp; }
    public boolean getPenUp(){ return penUp; }
    public void run(Interpreter interpreter){ interpreter.runPenUp(this);}
}

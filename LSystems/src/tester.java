import galapagos.Turtle;

public class tester {
    public static void main(String[] args){
        KochCurve curva = new KochCurve();
        curva.setStart("F");
        curva.addRule('F',"F+F-F-F+F");
        String word1 = curva.iter(2);

        //System.out.println(word1);

        Turtle turtle = new Turtle();
        turtle.forward(100);
    }
}


import galapagos.Turtle;

public class tester {
    public static void main(String[] args){
        KochCurve curva = new KochCurve();
        curva.setStart("F");
        curva.addRule('F',"F+F-F-F+F");
        String word1 = curva.iter(2);

        //System.out.println(word1);

        Compiler compiler = new Compiler();
        compiler.addRule('F',new Forward(10));
        compiler.addRule('+',new Turn(60));
        compiler.addRule('-',new Turn(-60));
        compiler.compile(word1);
        System.out.println(compiler.compile(word1));
    }
}


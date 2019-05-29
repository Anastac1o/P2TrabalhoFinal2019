public class tester {
    public static void main(String[] args){
        KochCurve curva = new KochCurve();
        curva.setStart("F");
        curva.addRule('F',"F+F-F-F+F");
        String word1 = curva.iter(5);

        System.out.println(word1);
    }
}

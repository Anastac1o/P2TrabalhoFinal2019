import galapagos.Turtle;

import java.util.List;
import java.util.Vector;

public class tester {
    public static void main(String[] args){
        KochCurveTester teste = new KochCurveTester();
        CantorSetTester teste1 = new CantorSetTester();
        SierpinskiTriangleTester teste2 = new SierpinskiTriangleTester();
        SierpinskiArrowheadTester teste3 = new SierpinskiArrowheadTester();
        DragonCurveTester teste4 = new DragonCurveTester();
        KochSnowflakeTester teste5 = new KochSnowflakeTester();

        //teste2.draw(1);
        teste5.draw(10);
        //teste3.draw(5);
        //teste.draw(5);
    }
}


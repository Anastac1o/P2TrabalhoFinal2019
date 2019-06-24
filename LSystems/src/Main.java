import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        KochCurveTester curve = new KochCurveTester();
        KochSnowflakeTester snowflake = new KochSnowflakeTester();
        SierpinskiTriangleTester triangle = new SierpinskiTriangleTester();
        SierpinskiArrowheadTester arrowhead = new SierpinskiArrowheadTester();
        DragonCurveTester dcurve = new DragonCurveTester();
        CantorSetTester cantor = new CantorSetTester();

        Scanner scanner = new Scanner(System.in);

        System.out.println("LSystem\nEscolha uma das seguintes opções:");
        System.out.println("1 - KochCurve");
        System.out.println("2 - KochSnowflake");
        System.out.println("3 - SierpinskiTriangle");
        System.out.println("4 - SierpinskiArrowhead");
        System.out.println("5 - Dragon Curve");
        System.out.println("6 - Cantor Set");

        int userChoice = scanner.nextInt();

        System.out.println("Escolha o numero de iterações a realizar:");

        int numIter = scanner.nextInt();


        if (userChoice == 1) {
            curve.draw(numIter);
        }
        if (userChoice == 2) {
            snowflake.draw(numIter);
        }
        if (userChoice == 3) {
            triangle.draw(numIter);
        }
        if (userChoice == 4) {
            arrowhead.draw(numIter);
        }
        if (userChoice == 5) {
            dcurve.draw(numIter);
        }
        if (userChoice == 6) {
            cantor.draw(numIter);
        }
    }
}

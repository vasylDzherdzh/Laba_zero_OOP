import java.util.Date;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Main prog = new Main();
        prog.calculation();
        prog.datatime();

    }
    private void calculation () {
        System.out.printf("a = ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.printf("b = ");
        double b = scanner.nextDouble();
        System.out.printf("t = ");
        double t = scanner.nextDouble();
        System.out.printf("e = ");
        double e = scanner.nextDouble();
        run( a, b, t, e);
    }
    // double a = -0.5, b = 1,7, t=0.44;
    private void run(double a, double b, double t, double e)
    {
        double y =(Math.pow(e,-b*t)*Math.sin((a*t)+b))-(Math.sqrt(Math.abs((b*t)+a)));
        double s =(b*Math.sin((a*Math.pow(t,2))*Math.cos(2)*t))-1;
        System.out.printf("a = %f; b = %f; t = %f; e=%f", a, b, t, e);
        System.out.println("\n y = " +y);
        System.out.println(" s = "+s);
    }
    private void datatime ()
    {
        Date dat = new Date();
        System.out.printf("%td", dat);
        System.out.printf(" %tB", dat);
        System.out.printf(" %tY", dat);
    }
}

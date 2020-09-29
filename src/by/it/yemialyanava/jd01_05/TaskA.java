package by.it.yemialyanava.jd01_05;
import static java.lang.Math.*;

public class TaskA {
    public static void main(String[] args) {
        step1();
        step2();
        step3();
    }

    private static void step1() {
        double x = 0.3;
        double a = 756.13;
        double part1 = cos (pow(( x * x + PI / 6), 5));
        double part2 = sqrt(x*(pow(a, 3)));
        double part3 = log(abs((a - 1.12 * x)/4));
        double z = part1 - part2 - part3;
        System.out.println("z = " + z);
    }

    /*private static void step1() {
        double x = 0.3;
        double a = 756.13;
        double z = (Math.cos (Math.pow(( x * x + Math.PI / 6), 5))) - Math.sqrt(x*(pow(a,3))) -  (Math.log(a - 1.12 * x) - Math.log(4));
        System.out.println("z = " + z);
    }*/

    private static void step2() {
        double a = 1.21;
        double b = 0.371;
        double y = tan(pow((a+b), 2)) - cbrt(a + 1.5) + (a * pow(b, 5)) - b/(log(pow(a,2)));
        /*double part1 = tan(pow((a+b), 2));
        double part2 =  cbrt(a + 1.5);
        double part3 = a * pow(b, 5);
        double part4 = b/(log(pow(a,2)));
        double y = part1 - part2 + part3 - part4;*/
        System.out.println("y = " + y);
    }

    private static void step3() {
        double a = -5;
        double x = 12.1;
        while ((a>=-5)&&(a<=12)){
            double f = pow(E,a*x) - (3.45*a);
            a = a + 3.75;
            System.out.printf("При a=%6.2f f=%g\n", a,f);
        }
    }
}

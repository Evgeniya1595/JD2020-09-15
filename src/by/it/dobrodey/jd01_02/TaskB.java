package by.it.dobrodey.jd01_02;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
       step1();
       Scanner sc = new Scanner(System.in);
       System.out.println("Input month number (1 - 12):");
        int month = sc.nextInt();

        step2(month);

        System.out.println("Input a in ax^2+bx+c=0");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        step3(a, b, c);
    }
    static void step1(){
        for (int i = 1; i<= 25 ; i++) {
            System.out.print(i +" ");
            if (i%5==0) System.out.println();

        }

    }
    static void step2(int month) {
        switch (month) {
            case 1: System.out.println("январь");break;
            case 2: System.out.println("февраль");break;
            case 3: System.out.println("март");break;
            case 4: System.out.println("апрель");break;
            case 5: System.out.println("май");break;
            case 6: System.out.println("июнь");break;
            case 7: System.out.println("июль");break;
            case 8: System.out.println("август");break;
            case 9: System.out.println("сентябрь");break;
            case 10: System.out.println("октябрь");break;
            case 11: System.out.println("ноябрь");break;
            case 12: System.out.println("декабрь");break;
            default: System.out.println("нет такого месяца");
        }

    }

    static void step3(double a, double b, double c){
        double discrim = b*b - 4*a*c;
        if (discrim < 0)
            System.out.println("корней нет");
        else if (discrim == 0)
            System.out.println("Один корень уравнения х = "+(-b/(2*a)));
        else{
            double res1 = (-b + Math.sqrt(discrim))/(2*a);
            double res2 = (-b - Math.sqrt(discrim))/(2*a);

            System.out.println("В уравнение два корня \n х1 = "+res1+ "\n x2 = "+ res2);}





    }


}

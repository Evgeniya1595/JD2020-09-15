package by.it.khmel.jd01_01;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3.86
Земля   9.81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/
import java.util.Scanner;
class TaskC3 {

        public static double getWeight (int weight) {

            double a=3.86/9.81;
            double result=a*weight;
            result=Math.round(result*100);
            result=result/100;
            return result;
    }

    public static void main(String[] args) {
            System.out.println("Enter weight on the Earth");
        Scanner sc=new Scanner (System.in);
        int b=sc.nextInt();
            System.out.println(TaskC3.getWeight(b));
    }
        }


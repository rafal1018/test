package instrukcje_warunkowe_zadania;

import java.util.Scanner;

public class Task15
{
    public static void main(String[] args) {


        double a, b, c;
        System.out.println("Wprowadź trzy liczby a, b i c");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź a");
        a = scanner.nextDouble();

        System.out.println("Wprowadź b");
        b = scanner.nextDouble();

        System.out.println("Wprowadź c");
        c = scanner.nextDouble();

        if(a + b == c)
        {
            System.out.println("Da się");
        }
        else if( c + b == a)
        {
            System.out.println("Da się");
        }
        else if( c + a == b)
        {
            System.out.println("Da się");
        }
        else
        {
            System.out.println("Wy*****j");
        }
    }
}

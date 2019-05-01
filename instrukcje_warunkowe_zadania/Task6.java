package instrukcje_warunkowe_zadania;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task6
{
    public static void main(String[] args) {

        double a, b, c;

        System.out.println("Podaj wartość a");;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextDouble();

        System.out.println("Podaj wartość b");

        b = scanner.nextDouble();

        System.out.println("Podaj wartość c");

        c = scanner.nextDouble();

        if(a > b && a > c)
        {
            System.out.println("Liczba a jest największa");
        }
        else if(b > a && b > c)
        {
            System.out.println("Liczba b jest nawiększa");
        }
        else
        {
            System.out.println("Liczba c jest największa");
        }
    }
}

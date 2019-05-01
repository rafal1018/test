package instrukcje_warunkowe_zadania;

import java.util.Scanner;

public class Task14
{
    public static void main(String[] args) {

        System.out.println("Wprowadź dowolną liczbę");

        int a;

        Scanner qwe = new Scanner(System.in);

        a = qwe.nextInt();

        if(a%3 == 0)
        {
            System.out.println("Liczba jest podzielna przez 3");
        }
        else if(a%5 == 0)
        {
            System.out.println("Podana liczba jest podzielna przez 5");
        }

        if(a%5 == 0 && a%3 == 0)
        {
            System.out.println("Podana liczba jest podzielna przez 5 oraz 3");
        }
        else
        {
            System.out.println("Podana liczba nie jest podzielna przez 3 ani przez 5");
        }
    }
}

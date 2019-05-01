package instrukcje_warunkowe_zadania;

import java.util.Scanner;

public class Task2
{
    public static void main(String[] args) {

        System.out.println("podaj dowolną liczbę całkowitą dodatnią");

        int a;

        Scanner juk = new Scanner(System.in);

        a = juk.nextInt();

        if(a%3 == 0)
        {
            System.out.println("podana liczba jest podzielna przez 3");
        }
        else
        {
            System.out.println("Podana liczba nie jest podzielna przez 3");
        }
    }
}

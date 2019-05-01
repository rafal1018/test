package instrukcje_warunkowe_zadania;

import java.util.Scanner;

public class Task1
{
    public static void main(String[] args) {

        System.out.println("podaj wartość całkowitą liczby a");

        int a;

        Scanner odczyt = new Scanner(System.in);

        a =odczyt.nextInt();

        if(a > 5)
        {
            System.out.println("liczba a = " + a + " jest większa od 5");
        }
        else
        {
            System.out.println("Liczba  = " + a + " jest mniejsza od 5");
        }
    }
}

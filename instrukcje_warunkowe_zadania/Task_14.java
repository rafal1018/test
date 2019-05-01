package instrukcje_warunkowe_zadania;

import java.util.Scanner;

public class Task_14
{
    public static void main(String[] args) {

        System.out.println("Podaj swój wiek");

        Scanner qwe = new Scanner(System.in);

        int age = qwe.nextInt();

        if(age < 18)
        {
            System.out.println("Jesteś niepełnoletni");
        }
        else
        {
            System.out.println("Jesteś pełnoletni");
        }
    }
}

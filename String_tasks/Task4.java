package String_tasks;

import java.util.Scanner;

public class Task4
{
    public static void main(String[] args) {

        System.out.println("Podaj wyraz napisany dużymi literami");

        Scanner odczyt = new Scanner(System.in);

        String word = odczyt.nextLine();

        System.out.println(word.toLowerCase());
    }
}

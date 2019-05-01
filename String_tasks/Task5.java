package String_tasks;

import java.util.Scanner;

public class Task5
{
    public static void main(String[] args) {

        System.out.println("podaj dowolny wyraz");

        Scanner odczyt = new Scanner(System.in);

        String word = odczyt.nextLine();

        System.out.println(word.charAt(0)=='A');
    }
}

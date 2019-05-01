package String_tasks;

import java.util.Scanner;

public class ask2
{
    public static void main(String[] args) {
        System.out.println("Podaj imię");

        Scanner odczyt = new Scanner(System.in);

        String name = odczyt.nextLine();

        System.out.println(name.length());
    }
}

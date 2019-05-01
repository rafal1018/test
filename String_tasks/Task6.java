package String_tasks;

import java.util.Scanner;

public class Task6
{
    public static void main(String[] args) {
        System.out.println("Wpisz zdanie");

        Scanner odczyt = new Scanner(System.in);

        String word = odczyt.nextLine();

        System.out.println(word.contains("kot"));
    }
}

package instrukcje_warunkowe_zadania;

import java.util.Scanner;

public class Task3
{
    public static void main(String[] args) {
        String word;

        System.out.println("Wprowadź dowolny wyraz");

        Scanner scanner = new Scanner(System.in);

        word = scanner.nextLine();

        if(word.equals("Akademia"))
        {
            System.out.println("Wprowadzony wyaraz, to Akademia");
        }
        else
        {
            System.out.println("Wprowadzono inny wyraz");
        }
    }
}

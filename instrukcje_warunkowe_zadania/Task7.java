package instrukcje_warunkowe_zadania;

import java.util.Scanner;

public class Task7
{
    public static void main(String[] args) {

        System.out.println("Wpisz dowolny wyraz");

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        int a = word.length() - 1;

        if(a == 'm')
        {
            System.out.println("ostatnia litera wyrazu to m");
        }
        else if(a == 'M')
        {
            System.out.println("ostatnia literaz wyrazu to M");
        }
        else
        {
            System.out.println("Ostatnia literaz wyrazu to " + word.charAt(a));
        }
    }
}

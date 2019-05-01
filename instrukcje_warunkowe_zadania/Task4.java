package instrukcje_warunkowe_zadania;

import java.util.Scanner;

public class Task4
{
    public static void main(String[] args) {

        System.out.println("Wpisz dowolne imię męskie lub żeńskie");

        Scanner odczyt = new Scanner(System.in);

        String name = odczyt.nextLine();

        int a = name.length() - 1;

        if(name.charAt(a) == 'a')
        {
            System.out.println("Podane imię jest imieniem żeńskim");
        }
        else
        {
            System.out.println("Podane imię jest imieniem męskim");
        }
    }
}

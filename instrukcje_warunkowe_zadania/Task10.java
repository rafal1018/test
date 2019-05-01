package instrukcje_warunkowe_zadania;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        System.out.println("Wprowadź adres URL");

        Scanner scanner = new Scanner(System.in);

        String url = scanner.nextLine();

        if(url.equals( "www.wp.pl"))
        {
            System.out.println("podany adres URL jest poprawny");
        }
        else
        {
            System.out.println("Podany adres URL nie jest poprawny");
        }
    }
}

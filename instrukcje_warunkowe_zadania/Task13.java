package instrukcje_warunkowe_zadania;

import java.util.Scanner;

public class Task13
{
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Wprowadź kod pocztowy w formacie XX-XXX");

        String kod = scanner.nextLine();

        if(kod.equals("87-630"))
        {
            System.out.println("Podany kod jest poprawny");
        }
        else
        {
            System.out.println("Podany kod nie jest poprawny");
        }
    }
}

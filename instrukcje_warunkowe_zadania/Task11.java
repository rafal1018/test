package instrukcje_warunkowe_zadania;

import java.util.Scanner;

public class Task11
{
    public static void main(String[] args) {

        System.out.println("Wpisz dowolne zdanie");

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        if(word.contains("kajak"))
        {
            System.out.println("Wprowadzone zdanie zawiera wyraz kajak");
        }
        else
        {
            System.out.println("We wprowadzonym wyrazie nie ma słowa kajak");
        }
    }
}

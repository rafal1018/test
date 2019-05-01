package instrukcje_warunkowe_zadania;

import java.util.Scanner;

public class Task9
{
    public static void main(String[] args) {

        System.out.println("Wpisz dowolny wyraz");

        Scanner qwe = new Scanner(System.in);

        String word1 = qwe.next();

        String word2 = qwe.next();

        if(word1.equals(word2))
        {
            System.out.println("tak");
        }
        else
        {
            System.out.println("nie");
        }
    }
}

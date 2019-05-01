package Zadania_kolekcje;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Task7
{
    public static void color(String WordFromUser)
    {
        List<String> colorList = Arrays.asList("czerwony", "zielony", "niebieski", "czarny", "brązowy");

        if(colorList.contains(WordFromUser))
        {
            System.out.println(colorList.indexOf(WordFromUser));
        }
        else
        {
            System.out.println("-1");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Podaj kolor");
        String word;
        Scanner odczyt = new Scanner(System.in);

        word = odczyt.nextLine();

        color(word);
    }
}

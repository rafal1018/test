package String_tasks;

import java.util.Scanner;

public class Task3
{
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Podaj pierwszy wyraz");

        String word1 = reader.nextLine();

        System.out.println(word1.equals("Akademia"));

        System.out.println("Podaj drugi wyraz");

        String word2 = reader.nextLine();

        System.out.println(word2.equals("Akademia"));

    }
}

package instrukcje_warunkowe_zadania;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        System.out.println("wprowadź dowolny wyraz");

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        if (word.charAt(word.length()-1) == word.charAt(0)) {
            System.out.println("pierwsza i ostatnia litera są takie same");
        } else {
            System.out.println("Wy****j");
        }
    }
}

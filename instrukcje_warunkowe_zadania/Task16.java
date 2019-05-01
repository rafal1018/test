package instrukcje_warunkowe_zadania;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {

        int age1, age2;

        Scanner dupa = new Scanner(System.in);

        System.out.println("podaj wiek pierwszej osoby");

        age1 = dupa.nextInt();

        System.out.println("Podaj wiek drugiej osoby");
        age2 = dupa.nextInt();

        if(age1 < 18 && age1 >13 && age2 <18 && age2 >13)
        {
            System.out.println("Obydwie osoby są nastolatkami");
        }
        else
        {
            System.out.println("Osoby nie są nastolatkami");
        }
    }
}

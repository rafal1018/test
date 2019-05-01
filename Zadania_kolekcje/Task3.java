package Zadania_kolekcje;

import java.util.*;

public class Task3
{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,2,5,6);
        Collections.sort(list);

        int frequency = 0;
        for(Integer value : list)
        {
            frequency = Collections.frequency(list, value);

            if (frequency == 1) {
                System.out.println(value + " wystepuje 1 raz");
            } else {
                System.out.println(value + " wystepuje " + value + " razy");
            }
        }
    }
}

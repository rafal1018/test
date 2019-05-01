package Zadania_kolekcje;

import java.util.*;

public class Task2
{
    public static void main(String[] args)
    {
        List<Integer> numberList = Arrays.asList(12, 4,5,7,8,1,2,3,7);
        System.out.println(getSortedList(numberList));
    }
    static List<Integer> getSortedList (List<Integer> numbers)
    {
        Collections.sort(numbers);
        return numbers;
    }
}

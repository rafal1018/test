package Zadania_kolekcje;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task8
{
    public static void main(String[] args)
    {
        List<Integer> lista = Arrays.asList(1,2,3,4,5,6);
        Collections.reverse(lista);
        System.out.println(lista);
    }
}

package Zadania_kolekcje;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Task1
{

    public static void main(String[] args)
    {
        List<Integer> data = new ArrayList<Integer>();
        data.add(2);
        data.add(3);
        data.add(5);
        data.add(null);
        data.add(6);
        data.add(9);
        data.add(1);
        data.add(null);
        data.add(0);
        data.add(21);

        List<Integer> data2 = new ArrayList<Integer>();

        for (int i = 0; i < data.size(); i++)
        {
            if(data.get(i)%3 == 0)
            {
                data2.add(data.get(i));
            }
        }
        System.out.println(data2);
    }
}

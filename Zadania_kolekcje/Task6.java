package Zadania_kolekcje;

import java.util.Arrays;
import java.util.List;

public class Task6
{
    public static void main(String[] args) {
        List<String> colours = Arrays.asList("czerwony", "czarny", "zielony", "niebieski");

        System.out.println(colours);
    }

    public static class Task5
    {
        public int sumLeft(int[] array, int i) {
            return sum(array,0,i-1);
        }

        public int sumRight(int[] array,int i){
            return sum(array,i+1,array.length-1);
        }

        public int sum(int[] array, int start, int end){
            int i = start;
            if (i >= start && i <=end) {
                int sum = 0;
                for (int j = start; j <=end ; j++) {
                    sum = sum+array[j];
                }
                return sum;
            } else {
                // i jest niepoprawne
                return -1;
            }
        }



        public static void main(String[] args) {
            int[] array = new int[5];
            array[0] = 1;
            array[1] = 2;
            array[2] = 3;
            array[3] = 4;
            array[4] = 5;

            Task5 task5 = new Task5();

            System.out.println(task5.sumLeft(array,2));

        }
    }
}

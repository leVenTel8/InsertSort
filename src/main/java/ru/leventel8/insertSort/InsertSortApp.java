package ru.leventel8.insertSort;

public class InsertSortApp {

    public static void main(String[] args){

        long[] unSortedList = new long[]{54,76,87,3,2,1,10};
        InsertSort insertSort = new InsertSort();
        System.out.print("До сортировки: ");

        for(int j=0;j < unSortedList.length;j++){
            long value = unSortedList[j];
            System.out.print(value);
            System.out.print(" ");
        }

        insertSort.Sort(unSortedList);

        System.out.print("После сортировки: ");
        for(int j=0;j < unSortedList.length;j++){
            long value = unSortedList[j];
            System.out.print(value);
            System.out.print(" ");
        }

    }

}

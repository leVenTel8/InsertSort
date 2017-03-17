package ru.leventel8.insertSort;

public class InsertSort {

    public static long[] Sort(long[] unSortedList) {
        if(unSortedList.length > 1)
            SortList(unSortedList);
        return unSortedList;
    }

    private static void SortList(long[] unSortedList) {
        int unsortedLength = unSortedList.length;
        int in, out;

        for(out = 1; out < unsortedLength; out++) {
            long temp = unSortedList[out];
            in = out;
            while (in > 0 && unSortedList[in-1] >= temp) {
                unSortedList[in] = unSortedList[in-1];            // перестановка большего с меньшим
                --in;

            }
            unSortedList[in] = temp;
        }
    }
}

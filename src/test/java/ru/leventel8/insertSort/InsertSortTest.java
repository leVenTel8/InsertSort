package ru.leventel8.insertSort;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertTrue;

public class InsertSortTest {

    @Test
    public void SortEmptyList(){
        assertTrue(Arrays.equals(new long[]{},InsertSort.Sort(new long[]{})));  // должен вернуть Пустой массив

    }

    @Test
    public void SortListWithOneElement() {
        assertTrue(Arrays.equals(new long[]{1},InsertSort.Sort(new long[]{1}))); // должен вернуть один отсортированный элемент
    }

    @Test
    public void SortListWithTwoElements() {              // должен вернуть отсортированный массив
        assertTrue(Arrays.equals(new long[]{1, 2},InsertSort.Sort(new long[]{1, 2})));
    }

    @Test
    public void SortListWithNElementaRandomOrder() {       // должен вернуть отсортированный массив
        assertTrue(Arrays.equals(new long[]{1, 2, 3, 4, 5, 6, 6, 7, 8},InsertSort.Sort(new long[]{3, 2, 7, 6, 4, 8, 6, 1, 5})));
    }


}
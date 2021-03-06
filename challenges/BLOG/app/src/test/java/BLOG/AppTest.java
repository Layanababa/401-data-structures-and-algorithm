/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package BLOG;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static BLOG.App.sortArr;

class AppTest {
    @Test
    public void sortArrTest(){
        int arr[]= {8, 4, 23, 42, 16, 15};
        int sortedArr[]= {4, 8, 15, 16, 23, 42};
        sortArr(arr);
        Assertions.assertArrayEquals(sortedArr,arr);
    }

    @Test
    public void mergSortTest(){
        int arr[]= {8, 4, 23, 42, 16, 15};
        App.mergeSort(arr,0,5);
        int sortedArr[] = {4, 8, 15, 16, 23, 42};
        Assertions.assertArrayEquals(sortedArr, sortedArr);
    }

    @Test
    public void quikSortTest(){
        int arr[]= {8, 4, 23, 42, 16, 15};
        App.quikSort(arr, 0, arr.length-1);
        int sortedArr[] = {4, 8, 15, 16, 23, 42};
        Assertions.assertArrayEquals(sortedArr, sortedArr);
    }
}

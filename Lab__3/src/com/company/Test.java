package com.company;

import java.util.Collection;
import java.util.List;

public class Test {
    public static int N=1500;
    /**
     * @return working hours of the add function
     */
  public static long testAdd(List<Integer> testList) {
      long startTime = System.nanoTime();
        for(int i = 0; i < N; i++)
            testList.add(i);
        return System.nanoTime() - startTime;
    }

   /**
      * @return working time of the delete function from the first element
     */
    public static long testDeleteFirst(List<Integer> testList) {
       long startTime = System.nanoTime();
        for(int i = 0; i < N; i++)
            testList.remove(0);
        return System.nanoTime()  - startTime;
    }

    /**
     * @return working time of the delete function starting from the last element
     */
    public static long testDeleteLast(List<Integer> testList) {
        addTo(N, testList);
        long startTime = System.nanoTime();
        for(int i = N-1; i > 0; i--)
            testList.remove(0);
        return System.nanoTime()  - startTime;
    }

    /**
     * @return time to get all items from all 1500 positions
     */
    public static long testGet(List<Integer> testList) {
         addTo(N, testList);
        long startTime = System.nanoTime();
        for(int i = 0; i < N; i++)
            testList.get(i);
        return System.nanoTime()  - startTime;
    }

    private static void addTo(int count, Collection<Integer> addCol) {
       for(int i = addCol.size(); i < count; i++)
        addCol.add(i);
    }
}

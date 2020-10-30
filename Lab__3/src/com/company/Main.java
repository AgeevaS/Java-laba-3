package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("проверяем на 1500");
        System.out.print("add             ");
        System.out.print("ArrayList ");
        System.out.printf("%12d", Test.testAdd(arrayList));
        System.out.print( "  LinkedList ");
        System.out.printf("%12d",Test.testAdd(linkedList));
        System.out.println();

        System.out.print("delete First   ");
        System.out.print("ArrayList ");
        System.out.printf("%12d", Test.testDeleteFirst(arrayList));
        System.out.print( "  LinkedList ");
        System.out.printf("%12d",Test.testDeleteFirst(linkedList));
        System.out.println();

        System.out.print("delete Last   ");
        System.out.print("ArrayList ");
        System.out.printf("%12d", Test.testDeleteLast(arrayList));
        System.out.print( "  LinkedList ");
        System.out.printf("%12d",Test.testDeleteLast(linkedList));
        System.out.println();

        System.out.print("get             ");
        System.out.print("ArrayList ");
        System.out.printf("%12d",Test.testGet(arrayList));
        System.out.print("  LinkedList ");
        System.out.printf("%12d",Test.testGet(linkedList));
    }
}

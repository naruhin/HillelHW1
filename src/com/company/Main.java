package com.company;
//Написать interface IntList и его реализацию IntArrayList - аналог List<Integer>.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Presentation of efficiency class IntArrayList

        //Let's create class example
        //Can be created an empty list(capacity - 10) or list with random nums (left border - right border)
        IntArrayList arrayList = new IntArrayList();
	    IntArrayList arrayListRnd = new IntArrayList(1,100);

        System.out.println("Normal empty list - " +  arrayList);
        System.out.println("List with random nums " + arrayListRnd + "\n");
        System.out.println("--------------------------------------------------");
        //Methods
        //Class implement methods from IntList interface (add(), set(), get(), remove(), removeByValue(), isEmpty(), size(), subList(), toArray())
        //Some methods are own to class like capacity(), trimToSize(), expandArraySize()

        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(54);
        arrayList.add(2);
        arrayList.add(235);
        arrayList.add(2,1998);
        arrayList.add(77);
        arrayList.add(2);
        arrayList.add(22);
        arrayList.add(0,777);
        arrayList.add(2);

        System.out.println("List after calling add() method - " + arrayList + "\n");
        System.out.println("--------------------------------------------------");

        //Let's remove some elements
        arrayList.remove(3);
        System.out.println("List after removing element at index 3 - " + arrayList);
        arrayListRnd.remove(6);
        System.out.println("RndList after removing element at index 6 - " + arrayListRnd + "\n");

        arrayList.removeByValue(2);
        System.out.println("List after removing all elements with value - 2: " + arrayList + "\n");
        System.out.println("--------------------------------------------------");

        //Method's get() and set()
        System.out.println("List : element at index 5 is " + arrayList.get(5));
        System.out.println("RndList : element at index 7 is " + arrayListRnd.get(7)  + "\n");

        arrayList.set(0,99);
        arrayListRnd.set(0,909);
        System.out.println("list: let's set element at index 0 to 99 - " + arrayList + "\nRndList: set element at index 0 to 909 - " + arrayListRnd  + "\n");
        System.out.println("--------------------------------------------------");

        //Cleaning the list and checking if it empty
        System.out.println(arrayList + " Is empty? - " + arrayList.isEmpty());
        arrayList.clear();
        System.out.println(arrayList + " Is empty? - " + arrayList.isEmpty() + "\n");
        System.out.println("--------------------------------------------------");

        //Let's check size and capacity
        System.out.println("List size is - " + arrayList.size() + "\nList capacity is - " + arrayList.capacity());
        System.out.println("RndList size is - " + arrayListRnd.size() + "\nRndList capacity is - " + arrayListRnd.capacity() + "\n");
        System.out.println("--------------------------------------------------");

        //In custody we gonna check methods toArray() and subList();
        System.out.println("List to Array:");
        int[] arr = arrayListRnd.toArray();
        for (int i : arr) {
            System.out.print(i + " ");
        }

        IntArrayList subList = (IntArrayList) arrayListRnd.subList(3,6);
        System.out.println("\n\nSubList(3 - 6) to RndList - " + arrayListRnd + "\nis - " + subList);
        System.out.println("--------------------------------------------------");


    }
}

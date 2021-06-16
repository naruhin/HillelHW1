package com.company;

import java.util.Arrays;

public class IntArrayList  implements IntList{
    private int size;
    private int[] arr;
    private int indexOfLastElementInArray = 0;

    //Constructor initialize an array
    public IntArrayList() {
        this.size = 10;
        this.arr = new int[size];
    }

    //Initialize an array with random nums from left end to right end (ex: 1 to 100)
    public IntArrayList(int left, int right){
        this.size = 10;
        this.arr = new int[size];
        for(int i = 0;i < this.size; i++){
            arr[i] = (left + (int) (Math.random() * right));
            indexOfLastElementInArray++;
        }
    }

    //Expands array and copy all elements from old one
    public int[] expandArraySize(int[] oldArray){
        this.size = arr.length * 3 / 2 + 1;
        int[] newArray = new int[size];
        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
        return newArray;
    }


    public void trimToSize(){
        this.size = indexOfLastElementInArray;
        int[] temp =  new int[indexOfLastElementInArray];
        System.arraycopy(arr, 0, temp, 0, temp.length);
        this.arr = temp;
    }


    @Override
    public void add(int element) {
        if(this.indexOfLastElementInArray < size){
            arr[indexOfLastElementInArray] = element;
            this.indexOfLastElementInArray++;
        }
        else {
            arr = expandArraySize(arr);
            add(element);
        }
    }

    @Override
    public boolean add(int index, int element) {
        arr = indexOfLastElementInArray == size? expandArraySize(arr) : arr;
        int[] temp = new int[arr.length];

        for (int i = 0; i < indexOfLastElementInArray + 1; i++){
            if(i < index){ temp[i] = arr[i]; }
            else if(i == index){ temp[i] = element; }
            else { temp[i] = arr[i - 1]; }
        }

        indexOfLastElementInArray++;
        arr = temp;
        return true;
    }

    @Override
    public void clear() {
        Arrays.fill(arr, 0);
        indexOfLastElementInArray = 0;
    }

    @Override
    public int get(int index) {
        if(index > this.indexOfLastElementInArray){
            System.out.println("No such element");
        }
        return arr[index];
    }

    @Override
    public boolean isEmpty() {
        return indexOfLastElementInArray == 0;
    }

    @Override
    public boolean remove(int index) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < indexOfLastElementInArray - 1; i++){
            if(i < index){ temp[i] = arr[i]; }
            else if(i == index){ temp[i] = arr[i + 1]; }
            else { temp[i] = arr[i + 1]; }
        }
        arr = temp;
        indexOfLastElementInArray--;
        trimToSize();
        return true;
    }

    @Override
    public boolean removeByValue(int value) {
        for (int i = 0; i < this.arr.length; i++){
            if(arr[i] == value){
                remove(i);
            }
        }

        return true;
    }

    @Override
    public boolean set(int index, int element) {
        if(index > this.indexOfLastElementInArray){
            System.out.println("No such element");
            return false;
        }
        else{
            arr[index] = element;
        }
        return true;
    }

    @Override
    public int size() {
        return indexOfLastElementInArray;
    }

    public int capacity() {
        return this.size;
    }

    @Override
    public IntList subList(int fromIndex, int toIndex) {
        IntArrayList subList = new IntArrayList();
        if(fromIndex <= indexOfLastElementInArray && toIndex <= indexOfLastElementInArray){
            for(int i = 0; i < arr.length; i++){
                if(i >= fromIndex && i <= toIndex){
                    subList.add(arr[i]);
                }
            }
        }
        else{
            System.out.println("Not correct indexes!");
        }
        return subList;
    }

    @Override
    public int[] toArray() {
        int[] array = new int[indexOfLastElementInArray];
        System.arraycopy(arr, 0, array, 0, array.length);
        return array;
    }

    @Override
    public String toString() {
        int[] arrToString = new int[indexOfLastElementInArray];
        System.arraycopy(arr, 0, arrToString, 0, arrToString.length);
        return Arrays.toString(arrToString);
    }
}

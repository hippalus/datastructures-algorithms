package com.datastructures.algorithms.chapter2;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class LowArray {
    private long[] arr;
    private int currentIndex;

    public LowArray(int len) {
        this.arr = new long[len];
        currentIndex=0;
    }

    private int find(long searchKey) {

        for (currentIndex = 0; currentIndex < getSize(); currentIndex++) {
            if (get(currentIndex) == searchKey) {
                System.out.println(currentIndex + "nt index " + searchKey);
                break;
            }
        }
        if (currentIndex == getSize()) {
            System.out.println("Can't  find " + searchKey);
            return -1;
        } else return currentIndex;
    }
    private void delete(long val){
        int deleteIndex = find(val);
        int size=getSize()-1;
        for (int j = deleteIndex; j < size; j++) { ;
            set(j, get(j + 1));
        }

    }

    private void set(int index, long val) {
        if (isIndexGreaterThanArrayLen(index)) throw new ArrayIndexOutOfBoundsException();
        else arr[index] = val;
    }

    private long get(int index) {
        if (isIndexGreaterThanArrayLen(index)) throw new ArrayIndexOutOfBoundsException();
        else return arr[index];
    }

    private boolean isIndexGreaterThanArrayLen(int index) {
        return index > arr.length - 1;
    }

    private int getSize() {
        return arr.length;
    }
    private void display(){
        for (int j = 0; j < getSize(); j++) {
            System.out.print(get(j) + " , ");
        }

    }

    public static void main(String[] args) {
        LowArray arr = new LowArray(100);
        arr.set(0, 12);
        arr.set(1, 2819);
        arr.set(2, 29);
        arr.set(3, 315);
        arr.set(4, 2211);
        arr.set(5, 1);
        arr.set(6, 191);
        arr.set(7, 0);
        arr.set(8, 47);
        arr.set(9, 317);

        //search
        int i=arr.find(9846);
        System.out.println(i);
        arr.delete( 191);
        arr.display();


    }


}

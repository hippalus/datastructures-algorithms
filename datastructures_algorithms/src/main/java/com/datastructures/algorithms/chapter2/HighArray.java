package com.datastructures.algorithms.chapter2;

public class HighArray {
    private long[] arr;
    private int nElements;

    private HighArray(int maxSize) {
        this.arr = new long[maxSize];
        this.nElements = 0;
    }

    private void insert(long val) {
        arr[nElements] = val;
        nElements++;
    }

    //linear search
    private boolean find(long val) {
        int i;
        for (i = 0; i < nElements; i++) {
            if (arr[i] == val) {
                break;
            }
        }
        return i != nElements;
    }



    private boolean delete(long val) {
        int i;
        for (i = 0; i < nElements; i++) {
            if (arr[i] == val) {
                break;
            }
        }
        if (i == nElements) {

            return false;
        } else {
            if (nElements - i > 0) System.arraycopy(arr, i + 1, arr, i, nElements - i);
            nElements--;
            return true;
        }
    }

    private void display() {
        for (int i = 0; i < nElements; i++) {
            System.out.print(arr[i] + " , ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HighArray arr = new HighArray(50);
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);

        System.out.println( arr.binaryFind(12));
        arr.display();
        System.out.println(arr.find(11));
        System.out.println(arr.find(11111));
        arr.delete(88);
        arr.display();
        boolean delete = arr.delete(514516);
        System.out.println(delete);
        arr.display();

    }
}

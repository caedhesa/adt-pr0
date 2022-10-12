package edu.uoc.ds.adt;


public class PR0Array {

    // Array items.
    public final int ITEMS = 50;

    private int[] array;

    public PR0Array() {
        newArray();
    }

    public void newArray() {
        array = new int[ITEMS];
        for (int i = 0; i < array.length; i++) {
            array[i] = i*2;
        }
    }

    public int getIndexOf(int a) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]==a){
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int a) {
        if (array.length == 0) {
            return -1;
        }
        int low = 0;
        int high = array.length-1;

        while(low <= high ) {
            int middle = (low+high) /2;
            if (a> array[middle] ){
                low = middle +1;
            } else if (a< array[middle]){
                high = middle -1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public int[] getArray() {
        return this.array;
    }
}

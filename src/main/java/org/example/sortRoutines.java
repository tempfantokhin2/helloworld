package org.example;

public class sortRoutines {
    public void main(String[] args) {

    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            boolean arrayChanged = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    arrayRoutines.swapTwoElements(array, j, j + 1);
                    arrayChanged = true;
                }
            }
            if (!arrayChanged) break;
        }
    }
}

package com.meldmy.arrays;

class ArrayLeftRotation {

    static int[] rotLeft(int[] array, int leftRotation) {
        int[] res = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            res[(i + array.length - leftRotation) % array.length] = array[i];
        }
        return res;
    }
}



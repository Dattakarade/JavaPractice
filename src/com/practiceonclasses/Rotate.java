package com.practiceonclasses;

public class Rotate {

    public static void main(String args[]) {

        int[] arr = new int[]{21, 54, 11, 35, 4, 18};

        int n = 3;

        System.out.println("Origional Array");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < n - 1; i++) {
            int j, last;

            last = arr[arr.length - 1];

            for (j = arr.length - 1; j > 0; j--) {

                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        System.out.println("Array After Rotation :");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}







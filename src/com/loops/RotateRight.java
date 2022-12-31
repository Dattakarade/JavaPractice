package com.loops;

    class RotateRight {
        public static void main(String[] args) {
            int[] arr = new int[]{21, 54,11,35,4,18};

            int n = 3;

            System.out.println("Original array : ");

            for (int i = 0; i<arr.length; i++){
                System.out.println(arr[i] + "  ");
            }

            for (int i = 0; i < n-1; i++) {
                int j, last;

                last = arr[arr.length - 1];

                for (j = arr.length - 1; j > 0; j--) {

                    arr[j] = arr[j - 1];
                }
                arr[0] = last;
            }

                System.out.println("array After rotation :");

                for (int i=0; i<arr.length; i++){

                    System.out.println(arr[i]);

                }
            }
        }



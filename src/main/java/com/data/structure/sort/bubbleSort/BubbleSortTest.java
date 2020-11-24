package com.data.structure.sort.bubbleSort;

import java.util.Arrays;

public class BubbleSortTest {

    private static int arr[] = {2,7,6,9,4,10};

    public static void main(String[] args) {
        //oldMethods();
        goodMethod();
    }

    /**
     * 原始方法
     */
    public static void oldMethods() {

        int temp = 0;

        /**
         * 第一趟排序
         */
        for (int j = 0; j < arr.length -1; j++) {
            if (arr[j] > arr[j+1]) {
                temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println("第一趟排序后的数组为："+ Arrays.toString(arr));

        /**
         * 第二趟排序
         */
        for (int j = 0; j < arr.length -1 -1; j++) {
            if (arr[j] > arr[j+1]) {
                temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println("第二趟排序后的数组为："+ Arrays.toString(arr));

        /**
         * 第三趟排序
         */
        for (int j = 0; j < arr.length -1 -2; j++) {
            if (arr[j] > arr[j+1]) {
                temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println("第三趟排序后的数组为："+ Arrays.toString(arr));

        /**
         * 第四趟排序
         */
        for (int j = 0; j < arr.length -1 -3; j++) {
            if (arr[j] > arr[j+1]) {
                temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println("第四趟排序后的数组为："+ Arrays.toString(arr));

        /**
         * 第五趟排序
         */
        for (int j = 0; j < arr.length -1 -4; j++) {
            if (arr[j] > arr[j+1]) {
                temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println("第五趟排序后的数组为："+ Arrays.toString(arr));
    }

    public static void goodMethod() {
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j<arr.length-1 -i; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println("第"+i+1+"趟排序后的数组为："+ Arrays.toString(arr));
        }
    }
}

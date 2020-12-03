package com.data.structure.sort.practise;

import java.util.Arrays;

/**
 * 选择排序练习题
 */
public class SelectPractise {

    public static void main(String[] args) {
       //practise1();
       practise2();
    }

    public static void practise1() {
        int arr[] = {25,24,14,76,101,96,28};

        for (int i = 0; i < arr.length-1; i++) {
            int min = arr[i];
            int minIndex = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            // 交换数值
            if(minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }

            System.out.println("第"+(i+1)+"趟排序后的数组为："+ Arrays.toString(arr));
        }
    }

    public static void practise2() {
        int arr[] = {25,24,14,76,101,96,28};

        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int minIndex = i;

            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }

            System.out.println("第"+(i+1)+"趟排序后的数组为："+ Arrays.toString(arr));
        }
    }
}

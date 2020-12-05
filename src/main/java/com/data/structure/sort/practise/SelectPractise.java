package com.data.structure.sort.practise;

import java.util.Arrays;

/**
 * 选择排序练习题
 */
public class SelectPractise {

    public static void main(String[] args) {
        //practise1();
        //practise2();
        int arr[] = {25, 24, 14, 76, 101, 96, 28};
        practise3(arr);
    }

    public static void practise1() {
        int arr[] = {25, 24, 14, 76, 101, 96, 28};

        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            // 交换数值
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }

            System.out.println("第" + (i + 1) + "趟排序后的数组为：" + Arrays.toString(arr));
        }
    }

    public static void practise2() {
        int arr[] = {25, 24, 14, 76, 101, 96, 28};

        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }

            System.out.println("第" + (i + 1) + "趟排序后的数组为：" + Arrays.toString(arr));
        }
    }

    /**
     * 遍历数组，找出最小值，进行交换
     */
    public static void practise3(int[] arr) {

        /*for (int i = 0; i < arr.length -1; i++) {
            int minIndex = i;
            int min = arr[i];

            for (int j = i+1; j < arr.length; j++) {

            }

        }*/

        // 第一趟排序,使用arr[0]与后面数据进行比较，遇到比arr[0]就进行交换
        /*int minIndex = 0;
        int min = arr[0];

        // 遍历arr[0]之后的数据，与arr[0]进行比较
        for (int i = 0 + 1; i < arr.length; i++) {
            if (arr[0] > arr[i]) {
                // 交换，最小值重新赋值，最小下标值重新赋值
                min = arr[i];
                minIndex = i;
            }
        }

        // 交换顺序
        if (minIndex != 0) {
            arr[minIndex] = arr[0];
            arr[0] = min;
        }

        System.out.println("第一趟排序为："+Arrays.toString(arr));


        // 第二趟排序，arr[1]与后续数据进行比较，遇到比arr[1]小的值则进行交换
        min = arr[1];
        minIndex = 1;
        for (int i = 1+1; i < arr.length; i++) {
            if (arr[1] > arr[i]) {
                // 最小值与最小值下标重新赋值
                min = arr[i];
                minIndex = i;
            }
        }

        // 判断是否有比arr[1]更小的，有则进行交换
        if (minIndex != 1) {
            arr[minIndex] = arr[1];
            arr[1] = min;
        }

        System.out.println("第二趟排序为："+Arrays.toString(arr));*/


        /**
         * 优化：外部控制比较次数：i-1趟，里面次数递减，第一次由arr[0]与后续数据进行比较
         */
        for (int i = 0; i < arr.length - 1; i++) {

            // 定义最小值与最小值下标：由0开始
            int min = arr[i];
            int minIndex = i;

            // 比较值，由i+1开始进行比较
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // 对最小值与最小值下标进行重新赋值
                    min = arr[j];
                    minIndex = j;
                }
            }

            // 判断是否进行交换
            if (minIndex != i) {
                // 两个值进行交换
                arr[minIndex] = arr[i];
                arr[i] = min;
            }

            System.out.println("第" + (i + 1) + "趟排序后的数组为：" + Arrays.toString(arr));
        }



    }
}

package com.data.structure.sort.bubbleSort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static int arr[] = {1,2,4,3,6,5};

    public static void main(String[] args) {
        originMethod();
        //goodMethod();
    }

    /**
     * 原始方法
     * 1：前后两个数据比较确定最大值放到最后
     * 2：前后两个数据比较确定第4大值放到最后
     * 3：前后两个数据比较确定第3大值放到最后
     * 4：前后两个数据比较确定第2大值放到最后
     */
    public static void originMethod() {
        // 临时变量用于交换数据
        int temp = 0;

        // 第一趟交换
        for (int j = 0;j < arr.length -1 -0;j++) {
            if (arr[j] > arr[j+1]) {
                // 交换
                temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println("第一趟交换后的数组为："+ Arrays.toString(arr));

        // 第二趟交换
        for (int j = 0;j < arr.length -1 -1;j++) {
            if (arr[j] > arr[j+1]) {
                // 交换
                temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println("第二趟交换后的数组为："+ Arrays.toString(arr));

        // 第三趟交换
        for (int j = 0;j < arr.length -1 -2;j++) {
            if (arr[j] > arr[j+1]) {
                // 交换
                temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println("第三趟交换后的数组为："+ Arrays.toString(arr));

        // 第四趟交换
        for (int j = 0;j < arr.length -1 -3;j++) {
            if (arr[j] > arr[j+1]) {
                // 交换
                temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println("第四趟交换后的数组为："+ Arrays.toString(arr));
    }

    /**
     * 优化方法
     */
    public static void goodMethod() {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j<arr.length -1 -i; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println("第"+i+1+"趟交换后的数组为："+ Arrays.toString(arr));
        }
    }

    public static void oldMethod(int[] arr) {

        // 设置临时变量
        int temp = 0;

        // 第一趟排序：从0~n-1开始比较，确定最大值
        for (int i = 0; i<arr.length -1; i++) {
            // 前者大于后者进行交换
            if (arr[i] > arr[i+1]) {
                temp = arr[i+1];
                arr[i+1] =arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("第一趟交换后的数组为："+ Arrays.toString(arr));

        // 第二趟排序：从0~n-1-1开始比较，确定其中最大值
        for (int i = 0; i<arr.length -1 -1; i++) {
            // 前者大于后者进行交换
            if (arr[i] > arr[i+1]) {
                temp = arr[i+1];
                arr[i+1] =arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("第二趟交换后的数组为："+ Arrays.toString(arr));

        // 第三趟排序：从0~n-1-2开始比较，确定其中最大值
        for (int i = 0; i<arr.length -1 -2; i++) {
            // 前者大于后者进行交换
            if (arr[i] > arr[i+1]) {
                temp = arr[i+1];
                arr[i+1] =arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("第三趟交换后的数组为："+ Arrays.toString(arr));

        // 第四趟排序：从0~n-3开始比较，确定最大值
        for (int i = 0; i<arr.length -1 -3; i++) {
            // 前者大于后者进行交换
            if (arr[i] > arr[i+1]) {
                temp = arr[i+1];
                arr[i+1] =arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("第四趟交换后的数组为："+ Arrays.toString(arr));

        // 第五趟排序：从0~n-4开始比较，确定最大值
        for (int i = 0; i<arr.length -1-4; i++) {
            // 前者大于后者进行交换
            if (arr[i] > arr[i+1]) {
                temp = arr[i+1];
                arr[i+1] =arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("第五趟交换后的数组为："+ Arrays.toString(arr));

    }
}

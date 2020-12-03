package com.data.structure.sort.selectSort;


import java.util.*;

/**
 * 选择排序：
 * 从一个数组中选择一个最小或最大的值与arr[0]进行交换
 * 第一次：0~n-1
 * 第二次：1~n-1
 * ....
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        //select(arr);
        //goodSelect(arr);
    }

    public static void select(int[] arr) {

        // 第一趟排序
        // 临时变量
        int minIndex = 0;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
              min = arr[i];
              minIndex = i;
            }
        }

        // 将最小值放在arr[0]
        arr[minIndex] = arr[0];
        arr[0] = min;
        System.out.println("第一趟排序后的数组为："+ Arrays.toString(arr));

        // 第二趟排序
        // 临时变量
        minIndex = 1;
        min = arr[1];
        for (int i = 2;i<arr.length; i++) {
            if (min > arr[i]) {
                minIndex = i;
                min = arr[i];
            }
        }

        // 交换
        arr[minIndex] = arr[1];
        arr[1] =min;
        System.out.println("第二趟排序后的数组为："+ Arrays.toString(arr));

        // 第三趟排序
        // 临时变量
        minIndex = 2;
        min = arr[2];
        for (int i = 3;i<arr.length; i++) {
            if (min > arr[i]) {
                minIndex = i;
                min = arr[i];
            }
        }

        // 交换
        arr[minIndex] = arr[2];
        arr[2] =min;
        System.out.println("第三趟排序后的数组为："+ Arrays.toString(arr));

        // 第四趟排序
        // 临时变量
        minIndex = 3;
        min = arr[3];
        for (int i = 4;i<arr.length; i++) {
            if (min > arr[i]) {
                minIndex = i;
                min = arr[i];
            }
        }

        // 交换
        arr[minIndex] = arr[3];
        arr[3] =min;
        System.out.println("第四趟排序后的数组为："+ Arrays.toString(arr));

        // 第五趟排序
        // 临时变量
        minIndex = 4;
        min = arr[4];
        for (int i = 5;i<arr.length; i++) {
            if (min > arr[i]) {
                minIndex = i;
                min = arr[i];
            }
        }

        // 交换
        arr[minIndex] = arr[4];
        arr[4] =min;
        System.out.println("第五趟排序后的数组为："+ Arrays.toString(arr));
    }

    /**
     * 优化方法
     * 规律：
     * 外层排序：n-1趟，最小值与最小值下标每次都会进行改变，第一次为0.第二次为1
     * 内层排序：第一趟为n-1趟，然后每次减1，第一次比较由0与1比较，第二次为1与2比
     * 设置标志位，未发生交换进行终止循环
     */
    public static void goodSelect(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            // 设置最小值与最小值下标
            int minIndex = i;
            int min = arr[i];
            for (int j = i+1;j< arr.length; j++) {
                if (min > arr[j]) {
                    minIndex = j;
                    min = arr[j];
                }
            }
            // 交换
            arr[minIndex] = arr[i];
            arr[i] = min;
            System.out.println("第"+(i+1)+"趟排序后的数组为："+ Arrays.toString(arr));
        }
    }



}

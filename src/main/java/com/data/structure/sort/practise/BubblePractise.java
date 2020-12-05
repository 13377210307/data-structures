package com.data.structure.sort.practise;


import java.util.Arrays;

/**
 * 冒泡排序练习
 */
public class BubblePractise {

    public static void main(String[] args) {

        //practise1();
        //practise2();
        int[] arr = {25,24,14,76,101,96,28};
        practise3(arr);
    }

    /**
     * 请使用冒泡排序算法编写程序，实现对数组{25,24,14,76,101,96,28}的排序
     */
    public static void practise1() {
        int arr[] = {25,24,14,76,101,96,28};

        // 临时变量
        int temp = 0;
        // 是否交换标志位
        Boolean flag = false;

        for (int i = 0; i < arr.length -1; i++) {

            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            if (!flag) {
                break;
            }else {
                flag = false;
            }

            System.out.println("第"+(i+1)+"趟排序后的数组为："+ Arrays.toString(arr));
        }
    }

    /**
     * 请使用冒泡排序算法编写程序，实现对数组{25,24,14,76,101,96,28}的排序
     *
     * 先定义一个临时变量作为交换所需变量
     * 遍历数组
     */
    public static void practise2() {
        int arr[] = {25,24,14,76,101,96,28};

        // 第一趟排序
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                // 交换
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("第一趟排序后的数组为："+Arrays.toString(arr));

        // 第二趟排序
        for (int i = 0; i < arr.length-1-1; i++) {
            if (arr[i] > arr[i+1]) {
                // 交换
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("第二趟排序后的数组为："+Arrays.toString(arr));

        // 第三趟排序
        for (int i = 0; i < arr.length-1-2; i++) {
            if (arr[i] > arr[i+1]) {
                // 交换
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("第三趟排序后的数组为："+Arrays.toString(arr));

        // 第二趟排序
        for (int i = 0; i < arr.length-1-3; i++) {
            if (arr[i] > arr[i+1]) {
                // 交换
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("第四趟排序后的数组为："+Arrays.toString(arr));
    }


    public static void practise3(int[] arr) {

        // 定义临时变量
        /*int temp = 0;

        // 第一趟排序
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] > arr[i+1]) {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] =temp;
            }
        }

        System.out.println("第一趟排序后的数组为："+Arrays.toString(arr));


        // 第二趟排序
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] > arr[i+1]) {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        System.out.println("第二趟排序后的数组为："+Arrays.toString(arr));*/

        // 定义临时变量
        int temp = 0;
        // 定义交换标志
        boolean flag = false;

        // 控制排序次数
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length -1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            // 判断是否进行交换过
            if (!flag) {
                // 未进行交换过
                break;
            }else {
                flag = false;
            }

            System.out.println("第"+(i+1)+"趟排序后的数组为："+ Arrays.toString(arr));
        }
    }

}

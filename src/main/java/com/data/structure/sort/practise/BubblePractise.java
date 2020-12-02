package com.data.structure.sort.practise;


import java.util.Arrays;

/**
 * 冒泡排序练习
 */
public class BubblePractise {

    public static void main(String[] args) {

        practise1();
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
}

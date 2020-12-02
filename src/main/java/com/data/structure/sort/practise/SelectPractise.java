package com.data.structure.sort.practise;

import java.util.Arrays;

/**
 * 选择排序练习题
 */
public class SelectPractise {

    public static void main(String[] args) {
       practise1();
    }

    public static void practise1() {
        int arr[] = {25,24,14,76,101,96,28};

        Boolean flag = false;

        for (int i = 0; i < arr.length-1; i++) {
            int min = arr[i];
            int minIndex = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    flag = true;
                    min = arr[j];
                    minIndex = j;
                }
            }

            // 交换数值
            if(minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }

            /*if (!flag) {
                break;
            }else {
                flag = false;
            }*/

            System.out.println("第"+(i+1)+"趟排序后的数组为："+ Arrays.toString(arr));
        }
    }
}

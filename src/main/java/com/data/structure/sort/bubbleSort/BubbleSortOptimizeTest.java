package com.data.structure.sort.bubbleSort;

import java.util.Arrays;

public class BubbleSortOptimizeTest {

    public static void main(String[] args) {
        int[] arr = {1,5,3,6,4};
        optimize(arr);
    }

    public static void optimize(int[] arr) {

        // 定义临时变量
        int temp = 0;

        // 定义数据是否交换标志
        Boolean flag = false;

        for (int i = 0; i < arr.length -1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    // 有交换，将标志变更
                    flag = true;
                    // 前者大于后者，进行交换
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }

            System.out.println(i+1+"趟排序:"+Arrays.toString(arr));

            if (!flag) {
                break;
            }else {
                flag = false;
            }
        }
    }
}

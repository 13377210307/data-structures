package com.data.structure.sort.bubbleSort;

import java.util.Arrays;

/**
 * 冒泡排序优化
 */
public class BubbleSortOptimize {

    public static void main(String[] args) {
        int[] arr = {1,2,4,3,6,5};
        System.out.println("排序之前的顺序为："+Arrays.toString(arr));
        optimize(arr);
        System.out.println("排序之后的顺序为："+Arrays.toString(arr));
    }

    /**
     * 优化算法
     */
    private static void optimize(int[] arr) {
        // 交换变量
        int temp = 0;

        // 是否交换
        Boolean flag = false;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    // 数据发生交换
                    flag = true;
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(i+1+"趟排序");
            if (flag) {
                // 未发生交换，不进行下次排序
                break;
            }else {
                // 将标志置为false
                flag = true;
            }
        }
    }
}

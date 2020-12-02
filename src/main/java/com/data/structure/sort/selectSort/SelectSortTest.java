package com.data.structure.sort.selectSort;

import java.util.Arrays;

public class SelectSortTest {

    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 1};
        //select(arr);
        goodSelect(arr);
    }

    /**
     * 选择算法核心思想
     * 假定当前数为最小值，依次与后续数比较，遇到更小的值则进行交换
     */
    public static void select(int[] arr) {

        int minIndex = 0;
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[0] > arr[i]) {
                // 两值比较
                minIndex = i;
                min = arr[i];
            }
        }

        // 数值交换
        arr[minIndex] = arr[0];
        arr[0] = min;
        System.out.println("第一趟排序后的数组为：" + Arrays.toString(arr));
    }

    /**
     * 优化算法
     */
    public static void goodSelect(int[] arr) {
        Boolean flag = false;
        for (int i = 0; i < arr.length-1; i++) {
            int min = arr[i];
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    flag = true;
                    min = arr[j];
                    minIndex = j;
                }
            }

            arr[minIndex] = arr[i];
            arr[i] = min;

            if (!flag) {
               break;
            }else {
                flag = false;
            }
            System.out.println("第"+(i+1)+"趟排序后的数组为："+ Arrays.toString(arr));
        }
    }
}

package com.data.structure.sort.practise;

import java.util.Arrays;

public class InsertPractise {

    public static void main(String[] args) {
        int[] arr = {25, 24, 14, 76, 101, 96, 28};
        insertPractise(arr);
    }


    public static void insertPractise(int[] arr) {
        for (int i = 1;i < arr.length;i++) {

            // 插入值
            int insertVal = arr[i];
            // 比较值下标
            int insertIndex = i-1;


            while(insertIndex >= 0 && arr[insertIndex] > insertVal) {
                arr[insertIndex +1] = arr[insertIndex];
                insertIndex --;
            }

            arr[insertIndex+1] = insertVal;

            System.out.println("第"+i+"趟排序为："+ Arrays.toString(arr));
        }
    }
}

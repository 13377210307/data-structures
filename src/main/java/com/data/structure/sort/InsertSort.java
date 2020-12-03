package com.data.structure.sort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSort {


    public static void main(String[] args) {
        int[] arr = {25, 24, 14, 76, 101, 96, 28};
        //insert(arr);
        goodInsert(arr);
    }

    public static void insert(int[] arr) {

        /**
         * 第一轮
         */
        // 插入值：下标为1
        int insertVal = arr[1];
        // 插入下标：为需要比较的数的下标值：0
        int insertIndex = 1 - 1;

        // insertIndex >= 0：保证下标不越界：当下标值为0时会变成-1
        // arr[insertIndex] > insertVal：判断是否需要交换值
        while (insertIndex >= 0 && arr[insertIndex] > insertVal) {
            // 将比较值赋值给插入值：25，24  --》 25，25
            arr[insertIndex + 1] = arr[insertIndex];
            // 下标向前移  insertIndex：-1
            insertIndex--;
        }

        // 将原插入值赋值给比较值：arr[0]=arr[1]
        arr[insertIndex + 1] = insertVal;
        System.out.println("第1趟排序后的数组为：" + Arrays.toString(arr));

        /**
         * 第二轮
         */
        // 插入值为arr{2]
        insertVal = arr[2];
        // 比较下标
        insertIndex = 2 - 1;
        // 将arr[2]与arr[1]和arr[0]比较
        while (insertIndex >= 0 && arr[insertIndex] > insertVal) {
            // 1：24，25，14  ---》24，25，25   insertIndex = 0
            // 2：24，25，25  ---》24，24，25   insertIndex = -1
            arr[insertIndex + 1] = arr[insertIndex];
            insertIndex--;
        }

        // arr[0] = 原arr[2]
        arr[insertIndex + 1] = insertVal;
        System.out.println("第2趟排序后的数组为：" + Arrays.toString(arr));


        /**
         * 第三轮
         */
        // 插入值 arr[3]
        insertVal = arr[3];

        // 比较值下标
        insertIndex = 3-1;

        while(insertIndex >= 0 && arr[insertIndex] > insertVal) {
            arr[insertIndex +1] = arr[insertIndex];
            insertIndex --;
        }

        arr[insertIndex +1] = insertVal;
        System.out.println("第3趟排序后的数组为：" + Arrays.toString(arr));

        /**
         * 第四轮
         */
        // 插入值 arr[4]
        insertVal = arr[4];

        // 比较值下标
        insertIndex = 4-1;

        while(insertIndex >= 0 && arr[insertIndex] > insertVal) {
            arr[insertIndex +1] = arr[insertIndex];
            insertIndex --;
        }

        arr[insertIndex +1] = insertVal;
        System.out.println("第4趟排序后的数组为：" + Arrays.toString(arr));

        /**
         * 第五轮
         */
        // 插入值 arr[5]
        insertVal = arr[5];

        // 比较值下标
        insertIndex = 5-1;

        while(insertIndex >= 0 && arr[insertIndex] > insertVal) {
            // 1：14, 24, 25, 76, 101, 96 ----》14, 24, 25, 76, 101, 101    insertIndex=3
            arr[insertIndex +1] = arr[insertIndex];
            insertIndex --;
        }
        // arr[4] = 96
        arr[insertIndex +1] = insertVal;
        System.out.println("第5趟排序后的数组为：" + Arrays.toString(arr));

        /**
         * 第六轮
         */
        // 插入值 arr[6]
        insertVal = arr[6];

        // 比较值下标
        insertIndex = 6-1;

        while(insertIndex >= 0 && arr[insertIndex] > insertVal) {
            // 1：14, 24, 25, 76, 96, 101，28  --->  14, 24, 25, 76, 96, 101，101        insertIndex = 4
            // 2：14, 24, 25, 76, 96, 101，101  --->  14, 24, 25, 76, 96, 96，101        insertIndex = 3
            // 3：14, 24, 25, 76, 96, 96，101  --->  14, 24, 25, 76, 76, 96，101         insertIndex = 2
            arr[insertIndex +1] = arr[insertIndex];
            insertIndex --;
        }

        // arr[3] = 28
        arr[insertIndex +1] = insertVal;
        System.out.println("第6趟排序后的数组为：" + Arrays.toString(arr));
    }

    public static void goodInsert(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            // 插入值
            int insertVal = arr[i];
            // 比较下标
            int insertIndex = i - 1;

            while(insertIndex >=0 && arr[insertIndex]> insertVal) {
                arr[insertIndex+1] = arr[insertIndex];
                insertIndex --;
            }
            arr[insertIndex +1] = insertVal;
            System.out.println("第"+i+"趟排序后的数组为：" + Arrays.toString(arr));
        }
    }
}

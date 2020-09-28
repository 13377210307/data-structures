package com.data.structure;


/**
 * 稀疏数组案例
 *
 * 需求：保存某个二维数组中的非零值
 *
 * 实现
 * 1：二维数组转稀疏数组
 *   1）遍历原始二维数组，得到有效数据的个数
 *   2）根据有效数据个数创建稀疏数组sparseArry int[sum+1][3]
 *   3）将二维数组的有效数据存入稀疏数组中
 *
 * 2：稀疏数组转二维数组
 *   1）读取稀疏数组第一行，根据第一行数据创建原始数组
 *   2）读取稀疏数组后几行的数据，并赋值给原始数组即可
 *
 */
public class SparseArry {

    public static void main(String[] args) {
        // 创建原始二维数组
        int[][] oldArr = createArr(8, 8);

        // 将二维数组转成稀疏数组
        int[][] sparseArr = oldArrToSparseArr(oldArr);

        // 将稀疏数组转成二维数组
        int[][] actualArr = sparseArrToActualArr(sparseArr);
    }


    /**
     * 创建原始二维数组
     *
     */
    public static int[][] createArr(Integer i,Integer j) {
       int[][] oldArr = new int[i][j];

       oldArr[1][5] = 2;
       oldArr[2][4] = 1;
       oldArr[3][0] = 4;

        System.out.println("我是原始数组");
        // 输出原始二维数组
        for (int[] row : oldArr) {
            for (int data : row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        System.out.println("====================================");
        return oldArr;
    }

    /**
     * 将二维数组转成稀疏数组
     * 思路
     *  1：遍历原始数组，获取有效数据个数以及原始二维数组的长度与宽度
     *  2：遍历原始数组并记录有效数据，将有效数据的位置以及值记录到稀疏数组中
     */
    public static int[][] oldArrToSparseArr(int[][] oldArr) {

        // 获取原始数组有效数据个数作为稀疏数组的第一行
        int sum = 0;
        for (int i = 0; i < oldArr.length; i++) {
            for (int j = 0; j < oldArr.length; j++) {
                if (oldArr[i][j] != 0) {
                    sum ++;
                }
            }
        }

        // 创建稀疏数组
        int[][] sparseArr = new int[sum + 1][3];

        // 设置第一列值
        sparseArr[0][0] = oldArr.length;
        sparseArr[0][1] = oldArr.length;
        sparseArr[0][2] = sum;

        // 遍历原始数组；设置有效数据

        // 记录有效数组个数
        int count = 0;
        for (int i = 0; i < oldArr.length; i++) {
            for (int j = 0; j < oldArr.length; j++) {
                if (oldArr[i][j] != 0) {
                    count ++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = oldArr[i][j];
                }
            }
        }

        System.out.println("我是稀疏数组");
        // 输出
        for (int i=0;i<sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
        }
        System.out.println("=======================================");

        return sparseArr;
    }

    /**
     * 将稀疏数组转成二维数组
     * 思路：
     *    1：读取第一行数据创建二维数组
     *    2：读取二维数组后几行数据，记录非零有效数据并赋值给二维数组
     */
    public static int[][] sparseArrToActualArr(int[][] sparseArr) {

        // 读取第一行数据。创建二维数组
        int[][] actualArr = new int[sparseArr[0][0]][sparseArr[0][1]];

        // 遍历读取后几行数组并赋值给稀疏数组：从第一行开始读取
        for (int i = 1; i < sparseArr.length; i++) {
            // 稀疏数组第二行表示有效数据所在原始数组的行数；第二列表示有效数据所在原始数组的列数；第三列表示所在原始数组的数值
            actualArr[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }

        System.out.println("我是稀疏数组转成的二维数组");
        for (int[] row: actualArr) {
            for (int data : row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        return actualArr;
    }
}

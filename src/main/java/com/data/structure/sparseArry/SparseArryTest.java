package com.data.structure.sparseArry;

/**
 * 将原始数组转成稀疏数组
 * 1：获取原始数组的行数与列数作为稀疏数组的第一行
 * 2：遍历原始数组，获取有效数据个数
 * 3：遍历原始数组将有效数据赋值给稀疏数组
 *
 * 稀疏数组转二维数组
 * 1：读取稀疏数组创建二维数组
 * 2：遍历稀疏数组将有效数据位置存在二维数组中
 */
public class SparseArryTest {

    public static void main(String[] args) {
        int[][] arry = createArry(8, 8);

        int[][] sparse = arrToSparse(arry);

        sparseToArr(sparse);

    }

    /**
     * 创建原始数组
     */
    public static int[][] createArry(int x,int y) {
        int[][] oldArry = new int[x][y];
        oldArry[2][5] = 5;
        oldArry[4][2] = 5;
        oldArry[3][1] = 5;

        // 遍历数组输出
        // 输出原始二维数组
        System.out.println("我是原始数组");
        for (int[] row : oldArry) {
            for (int data : row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        System.out.println("====================================");
        return oldArry;
    }

    /**
     * 原始数组转稀疏数组
     *
     */
    public static int[][] arrToSparse(int[][] oldArr) {

        // 遍历二维数组获取有效数据个数
        int sum = 0;
        for (int i = 0; i < oldArr.length; i++) {
            for (int j = 0; j < oldArr[0].length; j++) {
                if (oldArr[i][j] != 0) {
                    sum++;
                }
            }
        }

        // 创建稀疏数组
        int[][] sparseArr = new int[sum+1][3];

        // 设置第一行数据
        sparseArr[0][0] = oldArr.length;
        sparseArr[0][1] = oldArr[0].length;
        sparseArr[0][2] = sum;


        // 遍历二维数组
        int count = 0;
        for (int i = 0; i < oldArr.length; i++) {
            for (int j = 0; j < oldArr[0].length; j++) {
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
     * 将稀疏数组转成原始数组
     * 1：根据稀疏数组初始化二维数组
     * 2：遍历稀疏数组将稀疏数组有效数据放入二维数组中
     */
    public static int[][] sparseToArr(int[][] sparse) {
      int[][] oldArr = new int[sparse[0][0]][sparse[0][1]];

        // 遍历读取后几行数组并赋值给稀疏数组：从第一行开始读取
        for (int i = 1; i < sparse.length; i++) {
            // 稀疏数组第二行表示有效数据所在原始数组的行数；第二列表示有效数据所在原始数组的列数；第三列表示所在原始数组的数值
            oldArr[sparse[i][0]][sparse[i][1]] = sparse[i][2];
        }

        System.out.println("我是稀疏数组转成的二维数组");
        for (int[] row: oldArr) {
            for (int data : row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        return oldArr;
    }

}

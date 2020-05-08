package 数据结构与算法.排序.选择排序;


/*
    选择排序注意事项：
          1.和其他数一一比较选出最小的一个，交换的是下标，不是值
          2.内层循环交换下表，外层循环交换值
          3.外层循环可以少执行一次
          4.内层循环初始值和i相等
          5.选择时间复杂度都是n^2   不稳定    原因：【6，6，3】  换把前一个6置换到第二个6后面
 */
public class 选择排序 {

    static void choose(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            int temp = i;
            for (int j = i; j < arr.length; j++){
                if (arr[temp] > arr[j]) {
                        temp = j;
                }
        }
            swap(arr,i,temp);
    }}



        static void swap ( int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }


        public static void main (String[]args){
            int[] arr = {10, 3, 5, 50, 7};
            choose(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
}
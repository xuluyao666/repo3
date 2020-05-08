package 数据结构与算法.排序.选择排序;


/*
            插入排序注意事项：
                    1.跟冒泡类似 ，反着来
                    2.由于从后往前执行，内层循环 int j = i; j >0 ; j--
                    3.在进行置换值
                    4.选择时间复杂度都是n^2   最好是n   稳定
 */



public class 插入排序 {


    static void charu(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}

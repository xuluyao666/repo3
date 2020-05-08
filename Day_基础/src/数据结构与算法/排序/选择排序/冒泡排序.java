package 数据结构与算法.排序.选择排序;


/*
        冒泡排序注意事项：
                1.内层循环置换，两两比较大的往后移
                2.每次循环都要从头遍历数组，所以内层循环从0 开始
                3.跟后面的比较所有j<arr.length-1   防止j+1越界
                4.冒泡执行最慢：冒泡 < 选择 < 插入 < 希尔 <快速
                5.冒泡时间复杂度n^2  最低n   稳定

 */




public class 冒泡排序 {

    static void maopao(int[] arr){
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length-1 ; j++) {

                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }

        }


    public static void main(String[] args) {
        int[] arr={10,3,5,50,3};
        maopao(arr);
    }
}

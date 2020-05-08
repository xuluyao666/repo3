package 数据结构与算法.排序.选择排序;

public class 快速排序 {


        static void sort(int[] arr,int leftbound,int rightbound){
            if(leftbound >= rightbound) return;
            int mid=kuaisu(arr,leftbound,rightbound);
            sort(arr,leftbound,mid-1);    //mid确定位置不在动
            sort(arr,mid+1,rightbound);

        }

        static int kuaisu(int[] arr,int leftbound,int rightbound){
            int bound=rightbound;
            int left=leftbound;
            int right=rightbound-1;

            while (left <= right){    //=的作用：相邻数顺序正确不用执行下下面的置换    【8，9】 执行下面left增1即和边界本身交换
                while (left <= right  && arr[left] <= arr[bound]) left++;  //第一个<=:防止一边都是小于或大于轴 越界异常
                while (left <= right && arr[right] > arr[bound]) right--;  //第二个为了防止相同的数字在右边不和前面的进行交换
                if(left < right){                                          //左边大于轴的和右边小于轴的进行交换
                    swap(arr,left,right);
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            swap(arr,left,bound);                   //左边界和轴进行交换
            return left;
        }


        static void swap(int[] arr,int i ,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }









    public static void main(String[] args) {
        int[] arr={8,9,10};
        sort(arr,0,arr.length-1);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }
}

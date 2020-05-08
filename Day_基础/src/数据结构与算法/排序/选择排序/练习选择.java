package 数据结构与算法.排序.选择排序;

public class 练习选择 {



    static void sort(int[] arr ,int leftbound ,int rightbound ){
        if(leftbound>=rightbound) return;
        int mid = kuaisu(arr, leftbound, rightbound);
        sort(arr,leftbound,mid-1);
        sort(arr,mid+1,rightbound);

    }


    static int kuaisu(int[] arr,int leftbound,int rightbound){
        int left=leftbound;
        int right=rightbound-1;
        int sign=rightbound;

        while(left <= right){
            while (left <= right && arr[left] <= arr[sign]) left++;
            while (left <= right && arr[right] > arr[sign]) right--;

            if(left<right)
                swap(arr,left,right);
        }
        swap(arr,left,sign);

        return left;
    }

    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        int[] arr={5,4,7,5,2,8,6,1,7,9,11,15,13,2};
        sort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

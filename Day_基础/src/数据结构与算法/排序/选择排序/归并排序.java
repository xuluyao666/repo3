package 数据结构与算法.排序.选择排序;

public class 归并排序 {



    static void sort(int[] arr,int left,int right){
        if(left==right) return;
        //分成两部分
        int mid=left+(right-left)/2;
        //左边
        sort(arr,left,mid);
        //右边
        sort(arr,mid+1,right);
        merge(arr, left, mid + 1, right);

    }

    static  void merge(int[] arr,int leftpoint,int rightpoint,int rightbound){

        int[] result=new int[arr.length];
        int mid = rightpoint-1;

        int i = 0;
        int j = mid+1;
        int k = 0;

        while (i <= mid && j < arr.length){
            if(arr[i] <= arr[j]){
                result[k++] = arr[i++];
            }else {
                result[k++] = arr[j++];
            }
        }


        while (i <= mid) result[k++]=arr[i++];
        while (j < arr.length) result[k++]=arr[j++];


        for (int l = 0; l < arr.length; l++) {
            arr[l]=result[l];
        }

    }


    public static void main(String[] args) {
        int[] arr={1,8,9,4,5,3,6,2};
         sort(arr,0,7);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

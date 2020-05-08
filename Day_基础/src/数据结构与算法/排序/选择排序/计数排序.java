package 数据结构与算法.排序.选择排序;

/*
        计数排序注意事项：
                1.建立一个计数数组，记录原数组相同元素的数量
                2.进行数组累加
                3.将原数组倒序根据累加数组的数值（原数组元素位置）赋给新数组
                4.如果边界不是从零开始，所有在count【arr[i]】的arr【i】要减去边界值，否则越界
                5.累加数组中的是长度，遍历的时候要-1才是坐标




 */
public class 计数排序 {

    static int[] jishu(int[] arr,int sign,int left){
        int[] result = new int[arr.length];      //建立结果数组
        int[] count = new int[sign];            //建立计数数组

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]-left]++;               //遍历原数组得到计数数组
        }

        for (int i = 1; i < count.length; i++) {
            count[i]=count[i]+count[i-1];          //计数数组累加，确定位置 从坐标1开始（数组第二个）
        }

        for (int i = arr.length-1; i >= 0; i--) {
                result[--count[arr[i]-left]] = arr[i];
        }

        return result;
    }








    public static void main(String[] args) {
        int[] arr={10,14,12,13,11};
        int sign=5;     //元素范围
        int left=10;    //左边界
        int[] arr1 = jishu(arr,sign,left);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }



}

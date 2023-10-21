package test;

public class Test1 {
    public static void main(String[] args) {
        //设计一个方法返回数组的最大值

        //1.数组
        int[] arr = {10,2,3,4,5};
        System.out.println(MaxArr(arr));
    }
    public static int MaxArr(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > temp)
                temp = arr[i];
        }
        return temp;
    }
}

package cn.edu.cqcvc.test;

public class Test2 {
    public static void main(String[] args) {
        //判断101~200之间有多少个素数，并输出所有素数。
        int count = 0;
        //1.要判断101~200 知道范围用for循环
        for (int i = 101; i <= 200; i++) {
            int j;
            //2.判断i是否为素数，true则输出，false则不输出
            for (j = 2; j <= i / 2; j++) {
                if(i % j == 0)break;
            }
            if(j > i / 2){
            System.out.println(i + "是素数");
            count++;
            }
        }
        System.out.println("一共有" + count + "个素数");
    }
}

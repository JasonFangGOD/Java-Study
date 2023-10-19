package cn.edu.cqcvc.test;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //题目：程序自动生成一个1~100之间的数字，使用程序实现猜出这个数字是多少

        //1.随机1~100的数字
        Random r = new Random();
        int num = r.nextInt(100) + 1;

        //2.猜数字
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入猜的数字：");
            int a = sc.nextInt();
            if(a > num)
                System.out.println("大了");
            if(a < num)
                System.out.println("小了");
            if(a == num){
                System.out.println("恭喜猜对了！");
                break;
            }
        }
       /* for (int i = 1; i <= 100; i++) {
            if(i == num){
                System.out.println("猜到了！数字是：" + i);
            }
        }*/
    }
}

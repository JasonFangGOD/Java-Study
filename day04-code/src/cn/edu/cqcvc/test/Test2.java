package cn.edu.cqcvc.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //题目：从键盘录入一个数 x，判断该数是否为一个质数
        //质数：除了1和本身以外，不能被2~本身-1的任何一个数整除

        //1.录入一个数x
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = sc.nextInt();
        int i = 0;

        //2.判断是否为质数
        for(i = 2;i < num / 2;i++){
            if(num % i == 0){
                System.out.println(num + "是合数");
                break;
            }
        }
            if(i >= num / 2){
                System.out.println(num + "是质数");
            }
        //System.out.println(i);
    }
}

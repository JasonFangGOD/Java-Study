package cn.edu.cqcvc.a01oopextendsdemo1;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //题目：求平方根
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num = sc.nextInt();
        for (int i = 2; i < num; i++) {
            if (i * i == num) {
                System.out.println(i + "是" + num + "的平方根");
            }
        }
    }
}

package cn.edu.cqcvc.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //题目：键盘录入两个数字
        //如果其中一个为6，最终结果输出true
        //如果它们的和为6的倍数，输出true
        //其他情况输出false

        //键盘录入两个数字
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入数字1：");
        int num1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入数字2：");
        int num2 = sc2.nextInt();

        //其中一个为6 则可以判断第一个数字是否为6
        //num1 % 6 == 0 || num2 % 6 == 0
        //如果是，则直接输出true
        //如果不是，则进行下一个判断 和为6
        //num1 % 6 == 0 || num2 % 6 == 0 || (num1 + num2) % 6 == 0
        //如果以上都不满足，则输出false
        System.out.println(num1 == 6 || num2 == 6 || (num1 + num2) % 6 == 0);
    }
}

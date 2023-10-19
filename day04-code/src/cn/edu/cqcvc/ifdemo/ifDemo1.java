package cn.edu.cqcvc.ifdemo;

import java.util.Scanner;

public class ifDemo1 {
    public static void main(String[] args) {
        //题目：键盘录入女婿的酒量，如果大于两斤，老丈人给出回应，反之不回应

        //1.键盘录入女婿酒量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女婿的酒量：");
        int num = sc.nextInt();

        //2.用if语句进行判断
        if(num > 2){
            System.out.println("小伙子，不错哟！");
        }
    }
}

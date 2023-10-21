package test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //题目：设计一个圆的面积计算器，通过控制台
        //输入圆的半径，实现圆面积的计算功能

        //1.输入圆半径r
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        int radius = sc.nextInt();//定义一个radius变量来获取控制台输入的数字

        //2.计算圆
        //Π=3.1415926
        //S=Πr²
        double pai = 3.1415926;
        System.out.println("圆面积为S=" + (pai * radius * radius));
    }
}

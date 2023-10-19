package cn.edu.cqcvc.test;

import java.util.Scanner;//导入Scanner包

public class Test1 {
    public static void main(String[] args) {
        //题目：键盘录入一个三位数，获取其中过的个位、十位、百位

        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int number = sc.nextInt();//创建一个整型的number变量来接收一个三位数
        //2.获取个位
        int ge = number % 10;
        //3.获取十位
        int shi = number / 10 % 10;
        //4.获取百位
        int bai = number / 100;
        //5.打印个十百
        System.out.println("个位是：" + ge);
        System.out.println("十位是：" + shi);
        System.out.println("百位是：" + bai);
    }
}

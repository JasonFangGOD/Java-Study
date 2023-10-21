package test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个加数：");
        int num1 = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入第二个加数：");
        int num2 = sc.nextInt();

        System.out.println(num1 + "+" +  num2 + "的和是：" + (num1 + num2));
    }
}

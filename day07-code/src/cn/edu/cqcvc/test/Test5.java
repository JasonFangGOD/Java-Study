package cn.edu.cqcvc.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        System.out.println("书本价格为12元，你一共20元");
        System.out.println("1.铅笔的价格1元");
        System.out.println("2.橡皮的价格2元");
        System.out.println("3.可乐的价格3元");
        System.out.println("4.零食的价格5元");

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要购买商品的序号");
        int num = sc.nextInt();
        switch (num){
            case 1:{
                System.out.println("20元，购买一本书后，剩余的钱还可以购买"+8/1+"支铅笔，剩余0元");
                break;
            }
            case 2:{
                System.out.println("20元，购买一本书后，剩余的钱还可以购买"+8/2+"件橡皮，剩余0元");
                break;
            }
            case 3:{
                System.out.println("20元，购买一本书后，剩余的钱还可以购买"+8/3+"瓶可乐，剩余2元");
                break;
            }
            case 4:{
                System.out.println("20元，购买一本书后，剩余的钱还可以购买"+8/5+"包零食，剩余3元");
                break;
            }
        }
    }
}

package cn.edu.cqcvc.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //题目：动物园里有两只老虎，体重（kg）分别为键盘录入
        //请用程序实现判断两只老虎体重是否相同

        //1.录入体重
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重：");
        int weight1 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入第二只老虎的体重：");
        int weight2 = sc2.nextInt();

        //2.判断老虎体重是否相同
        //三元运算符进行判断
        //weight1 == weight2 ? true : false
        //System.out.println(weight1 == weight2 ? true : false);
        String result = weight1 == weight2 ? "体重相同" : "体重不同";
        System.out.println(result);
    }
}

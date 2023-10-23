package cn.edu.cqcvc.test1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的身高(m)：");
        float height = sc.nextFloat();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入你的体重(kg)：");
        float weight = sc.nextInt();

        float result = weight / (height * height);
        System.out.println("你的BMI值为：" + result);
        if(result < 18.5){
            System.out.println("所以你的身体状况为偏瘦！");
        }else if(result >= 18.5 || result <= 24){
            System.out.println("所以你的身体状况为正常！");
        }else if(result >= 24 || result <= 28){
            System.out.println("所以你的身体状况为偏胖！");
        }else if(result >= 28){
            System.out.println("所以你的身体状况为肥胖！");
        }
    }
}

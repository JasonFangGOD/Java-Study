package cn.edu.cqcvc.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*需求:
        机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
        按照如下规则计算机票价格：
        旺季（5-10月）头等舱9折，经济舱8.5折，
        淡季（11月到来年4月）头等舱7折，经济舱6.5折。*/

        //1.输入机票原价、月份和头等舱或经济舱
        //原价
        Scanner p = new Scanner(System.in);
        System.out.println("请输入机票的原价：");
        int Price = p.nextInt();
        //淡季旺季
        Scanner wang = new Scanner(System.in);
        System.out.println("请输入购买的月份：");
        int Month = wang.nextInt();
        //头等舱或经济舱
        Scanner seat = new Scanner(System.in);
        System.out.println("请输入头等舱或经济舱(0.头等舱 1.经济舱)：");
        int Seat = seat.nextInt();

        //判断计算价格

        //旺季
        if(Month > 4 && Month < 11){
            if(Seat == 0){
                System.out.println("您的机票价格经过打折后为：" + (Price * 0.9));
            }else if(Seat == 1){
                System.out.println("您的机票价格经过打折后为：" + (Price * 0.85));
            }
        }else if((Month > 10 && Month <= 12) || (Month >= 1 && Month <= 4)){
            if(Seat == 0){
                System.out.println("您的机票价格经过打折后为：" + (Price * 0.7));
            }else if(Seat == 1){
                System.out.println("您的机票价格经过打折后为：" + (Price * 0.65));
            }
        }else{
            System.out.println("输入的月份有误，请重新输入！");
        }

    }
}

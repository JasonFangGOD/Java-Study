package cn.edu.cqcvc.arithmeticoperator;

public class arithmeticoperatorDemo2 {
    public static void main(String[] args) {
        //除法
        //结论：
        //1.整数参与计算，结果只能得到整数
        //2.小数参与计算，结果有可能是不精确的
        System.out.println(10 / 2);//5
        System.out.println(10 / 3);//3
        System.out.println(10.0 / 3);//3.33333333333335
        //取模，取余。也是做除法运算，但是结果取余数
        System.out.println(10 % 2);//0
        System.out.println(10 % 3);//1
        //应用场景：
        //1.奇偶数判断
        //2.后面的斗地主发牌
    }
}

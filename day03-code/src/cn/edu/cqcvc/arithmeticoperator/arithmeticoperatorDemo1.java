package cn.edu.cqcvc.arithmeticoperator;

public class arithmeticoperatorDemo1 {
    public static void main(String[] args) {
        // +
        System.out.println(3 + 2);//5
        // -
        System.out.println(5 - 1);//4
        //*
        System.out.println(9 * 9);//81

        //如果在计算的时候有小数参与
        //结论：
        //在代码中，如果小数参与计算，结果有可能是不精确的。
        //猜测：可能涉及到数据类型不同
        System.out.println(5.08 + 12.16);
        System.out.println(5.08 - 12.16);
        System.out.println(5.08 * 12.16);
    }
}

package cn.edu.cqcvc.test;

public class Test4 {
    public static void main(String[] args) {
        //题目：已知三个和尚的身高分别为：150cm、210cm、165cm
        //请用程序实现获取这三个和尚的最高身高

        //1.变量存储三个身高
        float a = 150;
        float b = 210;
        float c = 165;
        float temp = 0;
        //2.比较3个变量
        //方法：两个三元
        //c > temp = (a > b ? a : b) ? c : temp;
        //System.out.println(c > temp = (a > b ? a : b) ? c : temp);
        temp = a > b ? a : b;
        float max = c > temp ? c : temp;
        System.out.println(max);
    }
}

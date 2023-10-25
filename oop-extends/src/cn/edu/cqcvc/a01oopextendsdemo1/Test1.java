package cn.edu.cqcvc.a01oopextendsdemo1;

public class Test1 {
    public static void main(String[] args) {
        //题目：打印99乘法表
        for(int i = 1;i <= 9;i++){
            for (int j=1;j<=9;j++){
                if(j<=i){
                    System.out.print(j+"*"+i+"="+(i*j)+"\t");
                }
            }
            System.out.println();
        }
    }
}
